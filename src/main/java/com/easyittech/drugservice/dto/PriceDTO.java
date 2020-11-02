package com.easyittech.drugservice.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@Getter@Setter
public class PriceDTO {
    private Long id;
    private double unitPrice;
    private double batchPrice;
    private Long batchCount;
    private String status;
    private Long drugId;
    private Date timeStamp;
}
