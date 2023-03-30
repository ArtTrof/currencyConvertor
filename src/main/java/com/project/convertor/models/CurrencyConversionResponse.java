package com.project.convertor.models;

import java.time.LocalDate;
import java.util.Map;

public class CurrencyConversionResponse {
    private String base;
    private String date;
    private Map<String, Double> rates;
    private Double convertedAmount;

    public CurrencyConversionResponse() {
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Map<String, Double> getRates() {
        return rates;
    }

    public void setRates(Map<String, Double> rates) {
        this.rates = rates;
    }

    public Double getConvertedAmount() {
        return convertedAmount;
    }

    public void setConvertedAmount(Double convertedAmount) {
        this.convertedAmount = convertedAmount;
    }
}
