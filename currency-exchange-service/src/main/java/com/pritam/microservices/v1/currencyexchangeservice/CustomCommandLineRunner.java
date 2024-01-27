package com.pritam.microservices.v1.currencyexchangeservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.pritam.microservices.v1.currencyexchangeservice.model.ExchangeValue;
import com.pritam.microservices.v1.currencyexchangeservice.repository.ExchangeValueRepository;
@Component
public class CustomCommandLineRunner implements CommandLineRunner {

	@Autowired
	private ExchangeValueRepository exchangeValueRepository;
	
	@Override
	public void run(String... args) throws Exception {
		exchangeValueRepository.save(new ExchangeValue(10001,"USD","INR",65));
		exchangeValueRepository.save(new ExchangeValue(10002,"EUR","INR",75));
		exchangeValueRepository.save(new ExchangeValue(10003,"AUD","INR",25));
	}

}
