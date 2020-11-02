package com.easyittech.drugservice.controller;

import com.easyittech.drugservice.domian.DrugDealer;
import com.easyittech.drugservice.service.DrugDealerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/drug-dealers")
public class DrugDealerController {
    @Autowired
    private DrugDealerService drugDealerService;
    @PostMapping("/add")
    public ResponseEntity<DrugDealer> saveDrugDealer(@RequestBody DrugDealer drugDealer){
        return ResponseEntity.ok().body(drugDealerService.save(drugDealer));
    }
    @GetMapping("/")
    public ResponseEntity<List<DrugDealer>> getAllDrugDealer(){
        return ResponseEntity.ok().body(drugDealerService.getAllDrugDealer());
    }

}
