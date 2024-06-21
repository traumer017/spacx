package com.example.spacx;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;


@SpringBootApplication
@EnableFeignClients
public class SpacxApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpacxApplication.class, args);
    }
}
