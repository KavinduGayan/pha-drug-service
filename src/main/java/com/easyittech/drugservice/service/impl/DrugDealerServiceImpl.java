package com.easyittech.drugservice.service.impl;

import com.easyittech.drugservice.domian.DrugDealer;
import com.easyittech.drugservice.repository.DrugDealerRepository;
import com.easyittech.drugservice.service.DrugDealerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class DrugDealerServiceImpl implements DrugDealerService {
    @Autowired
    private DrugDealerRepository drugDealerRepository;
    @Override
    public DrugDealer save(DrugDealer drugDealer) {
        drugDealer.setTimeStamp(new Date());
        return drugDealerRepository.save(drugDealer);
    }

    @Override
    public List<DrugDealer> getAllDrugDealer() {
        return drugDealerRepository.findAll();
    }
}
