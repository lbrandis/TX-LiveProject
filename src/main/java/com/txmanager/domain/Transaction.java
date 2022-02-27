package com.txmanager.domain;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;


public class Transaction {
	@Getter @Setter private String type;
	@Getter @Setter private Date date;
	@Getter @Setter private Integer accountNumber;
	@Getter @Setter private String currency;
	@Getter @Setter private Double amount;
	@Getter @Setter private String merhantName;
	@Getter @Setter private String merchantLogo;
	
}
