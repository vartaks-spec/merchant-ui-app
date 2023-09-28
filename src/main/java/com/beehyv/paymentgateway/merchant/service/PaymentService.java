package com.beehyv.paymentgateway.merchant.service;

import com.beehyv.paymentgateway.merchant.dto.PaymentRequest;
import org.springframework.http.ResponseEntity;

public interface PaymentService {
    ResponseEntity<String> makePayment(PaymentRequest request);
    ResponseEntity<String> checkPayment(String paymentId);


}
