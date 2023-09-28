package com.beehyv.paymentgateway.merchant.service.impl;

import com.beehyv.paymentgateway.merchant.dto.PaymentRequest;
import com.beehyv.paymentgateway.merchant.service.PaymentService;
import com.beehyv.paymentgateway.merchant.utils.WebCall;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class PaymentServiceImpl implements PaymentService {
    @Autowired
    private WebCall httpCall;
    @Override
    public ResponseEntity<String> makePayment(PaymentRequest request) {
        String response=(String) httpCall.callPostAPI(request,"http://localhost:8080/api/payment/request");
        return null;
    }

    @Override
    public ResponseEntity<String> checkPayment(String paymentId) {
        String response=(String)httpCall.callGetAPI("http://localhost:8080/api/payment/status/"+paymentId);
        return null;
    }
}
