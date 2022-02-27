package com.txmanager.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.json.GsonBuilderUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.txmanager.domain.Transaction;
import com.txmanager.service.TransactionService;

@RestController
@RequestMapping("/transactions")
public class TransactionController {
	@Autowired
	private TransactionService txService;
	
	@GetMapping("/{accountNumber}")
	public List<Transaction> getTransactions(@PathVariable("accountNumber")	final Integer accountNumber)
	{
		
		List<Transaction> transactions = txService.findAllByAccountNumber(accountNumber);
		
		ObjectMapper mapper = new ObjectMapper();
		try {
			System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(transactions));
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return transactions;
	}

}
