package com.easyittech.drugservice.controller;

import com.easyittech.drugservice.domian.Drug;
import com.easyittech.drugservice.dto.DrugDTO;
import com.easyittech.drugservice.service.DrugService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/drugs")
@CrossOrigin(origins = "http://localhost:4200")
public class DrugController {

    @Autowired
    private DrugService drugService;

    @PostMapping("/")
    public ResponseEntity<Drug> save(@RequestBody Drug drug) {
        return ResponseEntity.accepted().body(drugService.save(drug));
    }

    @GetMapping("/")
    public ResponseEntity<List<Drug>> getAllDrugs() {
        return ResponseEntity.accepted().body(drugService.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Drug>> getDrugById(@PathVariable("id") Long id) {
        return ResponseEntity.accepted().body(drugService.getDrugById(id));
    }

    @GetMapping("/key-word/{word}")
    public ResponseEntity<List<DrugDTO>> getDrugByKeyWord(@PathVariable("word") String word) {
        return ResponseEntity.ok().body(drugService.getDrugByWord(word));
    }
}
