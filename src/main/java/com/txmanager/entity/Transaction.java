package com.txmanager.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Entity
//@AllArgsConstructor
@NoArgsConstructor(access=AccessLevel.PRIVATE, force=true)
public class Transaction {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Getter @Setter private Long id;
	@Getter @Setter private String type;
	@Getter @Setter private Date date;
	@Getter @Setter private Integer accountNumber;
	@Getter @Setter private String currency;
	@Getter @Setter private Double amount;
	@Getter @Setter private String merchantName;
	@Getter @Setter private String merchantLogo;
	
	public Transaction(String type, 
						Date date, 
						Integer accountNumber, 
						String currency, 
						Double amount,
						String merchantName,
						String merchantLogo)
	{
		this.type = type;
		this.date = date;
		this.accountNumber = accountNumber;
		this.currency = currency;
		this.amount = amount;
		this.merchantName = merchantName;
		this.merchantLogo = merchantLogo;
	}
		
	
}
