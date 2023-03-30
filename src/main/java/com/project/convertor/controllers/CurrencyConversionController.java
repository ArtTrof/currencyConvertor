package com.project.convertor.controllers;

import com.project.convertor.models.CurrencyConversionResponse;
import com.project.convertor.services.CurrencyConversionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyConversionController {
    @Autowired
    private  CurrencyConversionService currencyConversionService;
    @GetMapping("/convert")
    public String convertCurrency(Model model, @RequestParam("baseCurrency")String baseCurrency,
                                  @RequestParam("targetCurrency")String targetCurrency,
                                  @RequestParam("amount")double amount){
        CurrencyConversionResponse result = currencyConversionService.convertCurrency(baseCurrency,targetCurrency,amount);
        model.addAttribute("result",result);
        return "index";
    }
}
