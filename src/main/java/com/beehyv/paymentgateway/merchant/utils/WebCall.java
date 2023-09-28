package com.beehyv.paymentgateway.merchant.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;


@Component
public class WebCall {

    @Autowired
    private WebClient webClient;

    public Object callPostAPI(Object object, String url) {
        return webClient
                .post()
                .uri(url)
                .body(Mono.just(object), new ParameterizedTypeReference<Object>() {
                })
                .retrieve()
                .bodyToMono(String.class)
                .block();
    }

    public Object callGetAPI(String url) {

        String str = webClient
                .get()
                .uri(url)
                .retrieve()
                .bodyToMono(String.class)
                .block();

        return str;

    }



}
