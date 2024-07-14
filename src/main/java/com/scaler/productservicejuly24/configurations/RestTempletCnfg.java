package com.scaler.productservicejuly24.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
@Configuration
public class RestTempletCnfg {
    @Bean
    public RestTemplate getRestTime(){
    return new RestTemplate();
    }
}
