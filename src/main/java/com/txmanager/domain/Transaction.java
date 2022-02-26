package com.txmanager.domain;

import java.util.Date;


public class Transaction {
	private String type;
	private Date date;
	private Integer accountNumber;
	private String currency;
	private Double amount;
	private String merhantName;
	private String merchantLogo;
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Integer getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(Integer accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public String getMerhantName() {
		return merhantName;
	}
	public void setMerhantName(String merhantName) {
		this.merhantName = merhantName;
	}
	public String getMerchantLogo() {
		return merchantLogo;
	}
	public void setMerchantLogo(String merchantLogo) {
		this.merchantLogo = merchantLogo;
	}

	
}
