package com.alfa.gif_service.client;

import com.alfa.gif_service.model.ExchangeRates;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "exchangeRatesClient", url = "${exchange.rates.url}")
public interface ExchangeRatesClient {

    @GetMapping(value = "/{date}.json")
    ExchangeRates getHistoricalExchangeRates(@PathVariable String date,
                                             @RequestParam(name = "app_id") String appId,
                                             @RequestParam String base);
}
