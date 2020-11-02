package com.easyittech.drugservice.client;

import com.easyittech.drugservice.dto.PriceDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(value = "priceclient", url = "http://localhost:8082")
public interface PriceClient {

    @GetMapping(value = "/api/v1/prices/")
    List<PriceDTO> getPriceList();
}
