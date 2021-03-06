package com.alfa.gif_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class GifServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(GifServiceApplication.class, args);
    }
}
