package com.easyittech.drugservice.domian;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "pha_drug_dealer")
@Getter@Setter
public class DrugDealer {

    @Id
    @Column(name = "drug_dealer_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long drugDealerId;
    @Column(name = "dealer_name")
    private String dealerName;
    @Column(name = "mobile_no")
    private String mobileNo;
    private String email;
    private String address;
    @Column(name = "inserted_date")
    @Temporal(TemporalType.TIMESTAMP)
    @CreationTimestamp
    private Date timeStamp;

}
