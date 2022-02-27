package com.txmanager.service;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.txmanager.domain.Transaction;

@Service
public class TransactionService {

	public List<Transaction> findAllByAccountNumber(Integer accountNumber)
	{
		Transaction t1 = new Transaction();
		t1.setAccountNumber(accountNumber);
		t1.setAmount(100.00);
		t1.setCurrency("USD");
		t1.setDate(new Date());
		t1.setMerchantLogo("logo.png");
		t1.setMerchantLogo("Amazon");
		t1.setType("Credit");
		

		List<Transaction> aTran = Arrays.asList(t1);
		
		return aTran;
	}
}
