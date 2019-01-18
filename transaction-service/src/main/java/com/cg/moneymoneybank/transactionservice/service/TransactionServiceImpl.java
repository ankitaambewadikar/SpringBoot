package com.cg.moneymoneybank.transactionservice.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.moneymoneybank.transactionservice.entity.Account;
import com.cg.moneymoneybank.transactionservice.entity.Transaction;
import com.cg.moneymoneybank.transactionservice.entity.TransactionType;
import com.cg.moneymoneybank.transactionservice.repository.TransactionRepository;

@Service
public class TransactionServiceImpl implements TransactionService {

	private Account account;
	@Autowired
	private TransactionRepository repository;

	@Override
	public Double fundTransfer(int senderAccountNumber, int receiverAccountNumber, double amount) {
		return null;
	}

	@Override
	public Double deposit(int accountNumber, String transactionDetails, double currentBalance, double amount) {
		Transaction transaction = new Transaction();
		transaction.setAccountNumber(accountNumber);
		transaction.setAmount(amount);

		currentBalance = transaction.getCurrentBalance() + amount;
		transaction.setCurrentBalance(currentBalance);
		transaction.setTransactionDate(LocalDateTime.now());
		transaction.setTransactionType(TransactionType.DEPOSIT);

		repository.save(transaction);
		return currentBalance;
	}

	@Override
	public Double withdraw(int accountNumber, String transactionDetails, double currentBalance, double amount) {

		Transaction transaction = new Transaction();
		transaction.setAccountNumber(accountNumber);
		transaction.setAmount(amount);

		currentBalance = transaction.getCurrentBalance() - amount;
		transaction.setCurrentBalance(currentBalance);
		transaction.setTransactionDate(LocalDateTime.now());
		transaction.setTransactionType(TransactionType.WITHDRAW);

		repository.save(transaction);
		return currentBalance;
	}

	@Override
	public List<Transaction> getAlltransactions() {
		
		return repository.findAll();
	}

}
