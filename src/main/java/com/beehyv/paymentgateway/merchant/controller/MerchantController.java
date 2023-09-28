package com.beehyv.paymentgateway.merchant.controller;

import com.beehyv.paymentgateway.merchant.dto.RegisterMerchantRequest;
import com.beehyv.paymentgateway.merchant.service.MerchantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/merchant")
public class MerchantController {

    @Autowired
    private MerchantService merchantService;

    @PostMapping("/register_merchant")
    public ResponseEntity<String> registerMerchant(@RequestBody RegisterMerchantRequest request) {
        return merchantService.createMerchant(request);
    }
}
