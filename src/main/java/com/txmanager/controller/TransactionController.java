package com.txmanager.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.txmanager.domain.Transaction;
import com.txmanager.service.TransactionService;

@RestController
@RequestMapping(value="v1/txmanager")
public class TransactionController {
	@Autowired
	private TransactionService txService;
	
	@RequestMapping(value="/transactions/{accountNumber}")
	public ResponseEntity<List<Transaction>> getTransactions(
		@PathVariable("accountNamber")	String accountNumber
	)
	{
		List<Transaction> transactions = txService.findAllByAccountNumber(accountNumber);
		
		return ResponseEntity.ok(transactions);
	}

}
