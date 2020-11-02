package com.easyittech.drugservice.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@Getter@Setter
public class DrugDTO {
    private Long id;
    private String description;
    private String brandName;
    private String status;
    private Date timestamp;
    private Long pharmacyId;
    private PriceDTO price;
}
