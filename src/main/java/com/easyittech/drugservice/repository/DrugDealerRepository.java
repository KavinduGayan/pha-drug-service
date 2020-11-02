package com.easyittech.drugservice.repository;

import com.easyittech.drugservice.domian.DrugDealer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
public interface DrugDealerRepository extends JpaRepository<DrugDealer,Long> {
}
