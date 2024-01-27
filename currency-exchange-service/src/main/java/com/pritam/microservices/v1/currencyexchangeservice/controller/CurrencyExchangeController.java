package com.pritam.microservices.v1.currencyexchangeservice.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.pritam.microservices.v1.currencyexchangeservice.model.ExchangeValue;

@RestController
public class CurrencyExchangeController {
	
	private static List<ExchangeValue> list;
	static {
		list = new ArrayList<ExchangeValue>();
		list.add(new ExchangeValue(10001,"USD","INR",65));
		list.add(new ExchangeValue(10002,"EUR","INR",75));
		list.add(new ExchangeValue(10003,"AUD","INR",25));
	}
	
	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public ExchangeValue retrieveExchangeValue(@PathVariable String from, @PathVariable String to) {
		return list.stream().filter(exchangeValue->exchangeValue.getFrom().equals(from)&&exchangeValue.getTo().equals(to)).findFirst().orElse(null);
	}
}
