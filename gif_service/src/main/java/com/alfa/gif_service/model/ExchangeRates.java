package com.alfa.gif_service.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.math.BigInteger;
import java.util.Map;

@Getter
@Setter
@AllArgsConstructor
public class ExchangeRates {
    private String disclaimer;
    private String license;
    private BigInteger timestamp;
    private String base;
    private Map<String, Double> rates;
}
