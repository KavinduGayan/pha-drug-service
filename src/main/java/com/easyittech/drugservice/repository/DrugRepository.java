package com.easyittech.drugservice.repository;

import com.easyittech.drugservice.domian.Drug;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.List;

@EnableJpaRepositories
public interface DrugRepository extends JpaRepository<Drug,Long> {

    List<Drug> findByDescriptionContaining(String word);
}
