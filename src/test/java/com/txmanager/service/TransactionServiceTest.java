package com.txmanager.service;


import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

import com.txmanager.domain.Transaction;

class TransactionServiceTest {

	@Test
	void testNumberOfTransactions() {
		TransactionService txService = new TransactionService();
		
		List<Transaction> transactions = txService.findAllByAccountNumber("12345");
		int txCount = transactions.size();
		assertEquals(5, txCount);
	}

}
