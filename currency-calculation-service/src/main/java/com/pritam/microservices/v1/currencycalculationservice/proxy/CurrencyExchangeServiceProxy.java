package com.pritam.microservices.v1.currencycalculationservice.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.pritam.microservices.v1.currencycalculationservice.model.CurrencyConversionBean;

@FeignClient(name = "currency-exchange-service", url = "http://localhost:8000")
public interface CurrencyExchangeServiceProxy {
	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public CurrencyConversionBean retrieveExchangeValue(@PathVariable String from, @PathVariable String to);
}
