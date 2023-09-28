package com.beehyv.paymentgateway.merchant.service;

import com.beehyv.paymentgateway.merchant.dto.RegisterMerchantRequest;
import org.springframework.http.ResponseEntity;

public interface MerchantService {
    ResponseEntity<String> createMerchant(RegisterMerchantRequest request);
}
