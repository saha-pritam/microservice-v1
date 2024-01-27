package com.pritam.microservices.v1.currencyexchangeservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pritam.microservices.v1.currencyexchangeservice.model.ExchangeValue;

public interface ExchangeValueRepository extends JpaRepository<ExchangeValue, Integer> {
	public ExchangeValue findByFromAndTo(String from, String to);
}
