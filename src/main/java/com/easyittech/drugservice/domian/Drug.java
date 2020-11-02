package com.easyittech.drugservice.domian;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "pha_drug")
@Getter@Setter
public class Drug {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column
    private String description;
    @Column(name = "brand_name")
    private String brandName;
    @Column
    private String status;
    @Column
    @Temporal(TemporalType.TIMESTAMP)
    private Date timestamp;
    @ManyToOne
    @JoinColumn(name = "drug_dealer_id")
    private DrugDealer drugDealer;
    @Column(name = "pharmacy_id")
    private Long pharmacyId;

}
