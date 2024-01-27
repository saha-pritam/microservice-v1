package com.pritam.microservices.v1.currencyexchangeservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.pritam.microservices.v1.currencyexchangeservice.model.ExchangeValue;
import com.pritam.microservices.v1.currencyexchangeservice.repository.ExchangeValueRepository;

@RestController
public class CurrencyExchangeController {
	
	@Autowired
	private Environment environment;
	
	@Autowired
	private ExchangeValueRepository exchangeValueRepository;
	
	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public ExchangeValue retrieveExchangeValue(@PathVariable String from, @PathVariable String to) {
		ExchangeValue value = exchangeValueRepository.findByFromAndTo(from, to);
		if(value!=null)
			value.setCurrencyExchangeServicePort(Integer.parseInt(environment.getProperty("local.server.port")));
		return value;
	}
}
