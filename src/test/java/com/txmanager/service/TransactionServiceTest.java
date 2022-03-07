package com.txmanager.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.txmanager.TransactionManagerApplication;
import com.txmanager.entity.Transaction;

@SpringBootTest(classes = {TransactionManagerApplication.class})
class TransactionServiceTest {
	
    @Autowired
	private TransactionService txService;
    
	@Test
	void testNumberOfTransactions() {	
		List<Transaction> transactions = txService.findAllByAccountNumber(12345);
		int txCount = transactions.size();
		assertEquals(1, txCount);
	}

}
