package com.easyittech.drugservice.service;

import com.easyittech.drugservice.domian.Drug;
import com.easyittech.drugservice.dto.DrugDTO;

import java.util.List;
import java.util.Optional;

public interface DrugService {

    Drug save(Drug drug);

    List<Drug> getAll();

    Optional<Drug> getDrugById(Long id);

    List<DrugDTO> getDrugByWord(String word);
}
