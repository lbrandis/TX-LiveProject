package com.txmanager.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.txmanager.entity.Transaction;
import com.txmanager.repositories.TransactionRepository;

@Service
public class TransactionService {
	
	private final TransactionRepository repository;
	
	@Autowired
    public TransactionService(final TransactionRepository repository) {
        this.repository = repository;
    }

	public List<Transaction> findAllByAccountNumber(final Integer accountNumber)
	{
		return repository.findAllByAccountNumber(accountNumber);
	}
}
