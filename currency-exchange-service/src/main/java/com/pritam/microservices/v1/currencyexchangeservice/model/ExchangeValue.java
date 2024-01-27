package com.pritam.microservices.v1.currencyexchangeservice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="ExchangeValue")
public class ExchangeValue {
	@Id
	@Column(name="id")
	private int id;
	@Column(name="fromCurrency")
	private String from;
	@Column(name="toCurrency")
	private String to;
	@Column(name="conversionMultiple")
	private double conversionMultiple;
	@Transient
	private int currencyExchangeServicePort;

	public ExchangeValue() {
	}

	public ExchangeValue(int id, String from, String to, double conversionMultiple) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.conversionMultiple = conversionMultiple;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public double getConversionMultiple() {
		return conversionMultiple;
	}

	public void setConversionMultiple(double conversionMultiple) {
		this.conversionMultiple = conversionMultiple;
	}

	public int getCurrencyExchangeServicePort() {
		return currencyExchangeServicePort;
	}

	public void setCurrencyExchangeServicePort(int currencyExchangeServicePort) {
		this.currencyExchangeServicePort = currencyExchangeServicePort;
	}

}
