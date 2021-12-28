package com.alfa.gif_service.service;

import com.alfa.gif_service.client.ExchangeRatesClient;
import com.alfa.gif_service.model.ExchangeRates;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class ExchangeRatesService {

    @Value("${app.id}")
    private String appId;

    @Value("${base.currency}")
    private String base;

    @Autowired
    ExchangeRatesClient exchangeRatesClient;

    ExchangeRates getHistoricalExchangeRates(String date) {
        return exchangeRatesClient.getHistoricalExchangeRates(date, appId, base);
    }
}
