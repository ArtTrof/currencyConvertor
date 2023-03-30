package com.project.convertor.models;

import java.time.LocalDate;
import java.util.Map;

public class CurrencyExchangeResponse {
    private String base;
    private LocalDate date;
    private Map<String,Double> rates;

    public CurrencyExchangeResponse() {
    }

    public CurrencyExchangeResponse(String base, LocalDate date, Map<String, Double> rates) {
        this.base = base;
        this.date = date;
        this.rates = rates;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Map<String, Double> getRates() {
        return rates;
    }

    public void setRates(Map<String, Double> rates) {
        this.rates = rates;
    }
}
