package com.alfa.gif_service.service;

import com.alfa.gif_service.model.ExchangeRates;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Optional;

@Service
@AllArgsConstructor
public class MainService {

    private final GifService gifService;

    private final ExchangeRatesService exchangeRatesService;

    public byte[] getStatusAccountByCurrencyName(String currencyName) {
        LocalDate today = LocalDate.now();
        LocalDate yesterday = today.minusDays(1);

        ExchangeRates todayExchangeRates = exchangeRatesService.getHistoricalExchangeRates(today.toString());
        ExchangeRates yesterdayExchangeRates = exchangeRatesService.getHistoricalExchangeRates(yesterday.toString());

        Double todayExchangeRatesValue = getExchangeRatesByCurrencyName(currencyName, todayExchangeRates);
        Double yesterdayExchangeRatesValue = getExchangeRatesByCurrencyName(currencyName, yesterdayExchangeRates);

        if (todayExchangeRatesValue != 0d && yesterdayExchangeRatesValue != 0d) {
            if (todayExchangeRatesValue > yesterdayExchangeRatesValue) {
                return gifService.getRichGif();
            } else return gifService.getBrokeGif();
        } else return null;
    }

    private Double getExchangeRatesByCurrencyName(String currencyName, ExchangeRates exchangeRates) {
        return Optional.ofNullable(exchangeRates.getRates().get(currencyName)).orElseGet(() -> 0d);
    }
}
