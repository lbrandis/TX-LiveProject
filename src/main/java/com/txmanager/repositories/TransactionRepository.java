package com.txmanager.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.txmanager.entity.Transaction;

public interface TransactionRepository extends CrudRepository<Transaction, Long> {
	List<Transaction> findByAccountNumber(Integer accountNumber);
}
