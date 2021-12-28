package com.alfa.gif_service.config;

import com.alfa.gif_service.client.RandomGiphyClient;
import feign.Feign;
import feign.Logger;
import feign.jackson.JacksonDecoder;
import feign.slf4j.Slf4jLogger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RandomGiphyConfig {

    @Bean
    public Feign randomGiphy(){
        return Feign.builder().decoder(new JacksonDecoder()).build();
    }
}
