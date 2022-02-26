package com.txmanager.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.txmanager.domain.Transaction;

@Service
public class TransactionService {

	public List<Transaction> findAllByAccountNumber(String acountNumber)
	{
		Transaction t1 = new Transaction();
		Transaction t2 = new Transaction();
		Transaction t3 = new Transaction();
		Transaction t4 = new Transaction();
		Transaction t5 = new Transaction();
		
		List<Transaction> transactions = Arrays.asList(t1,t2,t3,t4,t5);
		
		return transactions;
	}
}
