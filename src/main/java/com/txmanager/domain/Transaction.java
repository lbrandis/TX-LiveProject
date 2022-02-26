package com.txmanager.domain;

import java.awt.image.BufferedImage;

public class Transaction {
	
	private String type;
	private String date;
	private String accountNumber;
	private String currency;
	private Double amount;
	private String merhantName;
	private BufferedImage merchantLogo;
	
	

	@Override
	public String toString() {
		return "Transaction [type=" + type + ", date=" + date + ", accountNumber=" + accountNumber + ", currency="
				+ currency + ", amount=" + amount + ", merhantName=" + merhantName + ", merchantLogo=" + merchantLogo
				+ "]";
	}
	
}
