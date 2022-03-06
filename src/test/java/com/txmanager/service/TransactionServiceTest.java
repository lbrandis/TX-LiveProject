package com.txmanager.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.txmanager.entity.Transaction;
import com.txmanager.repositories.TransactionRepository;

class TransactionServiceTest {

    @Mock
    private TransactionRepository transactionRepository;
	
    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }
    
	@Test
	void testNumberOfTransactions() {
        when(transactionRepository.findByAccountNumber(anyInt()))
        .thenReturn(transactions());
		
		TransactionService txService = new TransactionService(transactionRepository);
		
		List<Transaction> transactions = txService.findAllByAccountNumber(12345);
		int txCount = transactions.size();
		assertEquals(1, txCount);
	}
	
    private List<Transaction> transactions() {
        return List.of(new Transaction("Credit", new Date(), 112345, "USD", 10000.00, "Amazon", "Logo"));
                  
    }

}
