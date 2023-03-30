package com.project.convertor.services;

import com.project.convertor.models.CurrencyConversionResponse;
import com.project.convertor.models.CurrencyExchangeResponse;
import com.project.convertor.repo.CurrencyExchangeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CurrencyConversionService {
    @Autowired
    private final CurrencyExchangeRepo exchangeRepo;

    public CurrencyConversionService(CurrencyExchangeRepo exchangeRepo) {
        this.exchangeRepo = exchangeRepo;
    }

    public CurrencyConversionResponse convertCurrency(String baseCurrency, String targetCurrency, Double amount) {
        CurrencyExchangeResponse response = exchangeRepo.getExchangeRate(baseCurrency, targetCurrency);
        double exchangeRate = response.getRates().get(targetCurrency);
        double convertedAmount = amount * exchangeRate;
        CurrencyConversionResponse currencyConversionResponse = new CurrencyConversionResponse();
        currencyConversionResponse.setBase(response.getBase());
        currencyConversionResponse.setDate(response.getDate().toString());
        currencyConversionResponse.setRates(response.getRates());
        currencyConversionResponse.getRates().put(targetCurrency, exchangeRate);
        currencyConversionResponse.setConvertedAmount(convertedAmount);
        return currencyConversionResponse;
    }

}
