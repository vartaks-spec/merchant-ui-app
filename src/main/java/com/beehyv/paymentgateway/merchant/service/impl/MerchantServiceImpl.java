package com.beehyv.paymentgateway.merchant.service.impl;


import com.beehyv.paymentgateway.merchant.dto.RegisterMerchantRequest;
import com.beehyv.paymentgateway.merchant.service.MerchantService;
import com.beehyv.paymentgateway.merchant.utils.WebCall;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class MerchantServiceImpl implements MerchantService {
    @Autowired
    private WebCall httpCall;

    @Override
    public ResponseEntity<String> createMerchant(RegisterMerchantRequest request) {
        String response = (String) httpCall.callPostAPI(request, "http://localhost:8080/api/merchant/register_merchant");
        return null;
    }
}

