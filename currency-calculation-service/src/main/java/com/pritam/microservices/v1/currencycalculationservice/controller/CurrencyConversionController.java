package com.pritam.microservices.v1.currencycalculationservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.pritam.microservices.v1.currencycalculationservice.model.CurrencyConversionBean;

@RestController
public class CurrencyConversionController {
	@GetMapping("/currency-converter/from/{from}/to/{to}/quantity/{quantity}")
	public CurrencyConversionBean retrieveCurrencyConversionBean(@PathVariable String from, @PathVariable String to, @PathVariable double quantity) {
		CurrencyConversionBean currencyConversionBean = new CurrencyConversionBean(1, from, to, 65.0, quantity, 8000);
		currencyConversionBean.setTotalCalculatedAmount();
		return currencyConversionBean;
	}
}
