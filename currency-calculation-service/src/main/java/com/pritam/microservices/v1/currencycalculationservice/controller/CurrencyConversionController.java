package com.pritam.microservices.v1.currencycalculationservice.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.pritam.microservices.v1.currencycalculationservice.model.CurrencyConversionBean;
import com.pritam.microservices.v1.currencycalculationservice.proxy.CurrencyExchangeServiceProxy;

@RestController
public class CurrencyConversionController {
	
	@Autowired
	private CurrencyExchangeServiceProxy currencyExchangeServiceProxy;

	@GetMapping("/currency-converter/from/{from}/to/{to}/quantity/{quantity}")
	public CurrencyConversionBean retrieveCurrencyConversionBean(@PathVariable String from, @PathVariable String to,
			@PathVariable double quantity) {
		CurrencyConversionBean currencyConversionBean = currencyExchangeServiceProxy.retrieveExchangeValue(from, to);
		if (currencyConversionBean != null) {
			currencyConversionBean.setQuantity(quantity);
			currencyConversionBean.setTotalCalculatedAmount();
		}
		return currencyConversionBean;
	}
}
