package com.example.spacx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
@EnableFeignClients
public class SpacxApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpacxApplication.class, args);
    }

    @Bean
    public WebClient webClient(RestTemplateBuilder builder) {
        return WebClient.builder().build();
    }
}