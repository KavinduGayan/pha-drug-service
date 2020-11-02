package com.easyittech.drugservice.service;

import com.easyittech.drugservice.domian.DrugDealer;

import java.util.List;

public interface DrugDealerService {

    DrugDealer save(DrugDealer drugDealer);

    List<DrugDealer> getAllDrugDealer();
}
