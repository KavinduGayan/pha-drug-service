package com.easyittech.drugservice.service.impl;

import com.easyittech.drugservice.client.PriceClient;
import com.easyittech.drugservice.dto.DrugDTO;
import com.easyittech.drugservice.dto.PriceDTO;
import com.easyittech.drugservice.repository.DrugRepository;
import com.easyittech.drugservice.domian.Drug;
import com.easyittech.drugservice.service.DrugService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class DrugServiceImpl implements DrugService {
    @Autowired
    private ModelMapper modelMapper;
    @Autowired
    private PriceClient priceClient;
    @Autowired
    private DrugRepository drugRepository;
    @Override
    public Drug save(Drug drug) {
        drug.setTimestamp(new Date());
        drugRepository.save(drug);
        return drug;
    }

    @Override
    public List<Drug> getAll() {
        return drugRepository.findAll();
    }

    @Override
    public Optional<Drug> getDrugById(Long id) {
        return drugRepository.findById(id);
    }

    @Override
    public List<DrugDTO> getDrugByWord(String word) {
        List<PriceDTO> priceDTOS =priceClient.getPriceList();
        List<Drug> drugs=drugRepository.findByDescriptionContaining(word);
        List<DrugDTO> drugDTOS=drugs.stream().map(drug -> modelMapper.map(drug, DrugDTO.class))
                .collect(Collectors.toList());
        drugDTOS.forEach(drug -> {
            PriceDTO priceDTO = priceDTOS.stream().filter(pr -> drug.getId().equals(pr.getDrugId())).findAny().orElse(null);
            drug.setPrice(priceDTO);
        });
        return drugDTOS;
    }
}
