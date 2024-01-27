package com.pritam.microservices.v1.currencycalculationservice.model;

public class CurrencyConversionBean {
	private int id;
	private String from;
	private String to;
	private double conversionMultiple;
	private double quantity;
	private double totalCalculatedAmount;
	private int currencyExchangeServicePort;

	public CurrencyConversionBean() {
	}

	public CurrencyConversionBean(int id, String from, String to, double conversionMultiple, double quantity,
			int currencyExchangeServicePort) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.conversionMultiple = conversionMultiple;
		this.quantity = quantity;
		this.currencyExchangeServicePort = currencyExchangeServicePort;
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

	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}

	public double getTotalCalculatedAmount() {
		return totalCalculatedAmount;
	}

	public void setTotalCalculatedAmount() {
		this.totalCalculatedAmount = this.conversionMultiple * this.quantity;
	}

	public int getCurrencyExchangeServicePort() {
		return currencyExchangeServicePort;
	}

	public void setCurrencyExchangeServicePort(int currencyExchangeServicePort) {
		this.currencyExchangeServicePort = currencyExchangeServicePort;
	}

}
