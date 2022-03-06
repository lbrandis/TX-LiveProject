package com.txmanager.controller;

import static java.util.stream.Collectors.toList;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.txmanager.dto.TransactionDto;
import com.txmanager.service.TransactionService;

@RestController
@RequestMapping("/transactions")
public class TransactionController {
	
	private final TransactionService txService;
	
    public TransactionController(final TransactionService txService) {
        this.txService = txService;
    }
	
	@GetMapping("/{accountNumber}")
	public List<TransactionDto> getTransactions(@PathVariable("accountNumber")	final Integer accountNumber)
	{
		List<TransactionDto> transactions = txService.findAllByAccountNumber(accountNumber).
				stream().map(transaction -> TransactionDto.apply(transaction)).
				collect(toList());
		
		
		  ObjectMapper mapper = new ObjectMapper(); 
		  
		  try {
			  System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(transactions)); 
		  } 
		  catch (JsonProcessingException e) { 
			  e.printStackTrace(); }
		 
		
		return transactions;
	}

}
