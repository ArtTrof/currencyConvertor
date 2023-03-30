package com.project.convertor.repo;

import com.project.convertor.models.CurrencyExchangeResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "currency-exchange", url = "https://api.exchangeratesapi.io")
public interface CurrencyExchangeRepo {

    @GetMapping(value = "/latest",headers = "apikey: SRRMfNmky3caMc0j62nYtkG6mmXP8u0L")
    CurrencyExchangeResponse getExchangeRate(@RequestParam("base") String fromCurrency,
                                             @RequestParam("symbols") String toCurrency);
}
