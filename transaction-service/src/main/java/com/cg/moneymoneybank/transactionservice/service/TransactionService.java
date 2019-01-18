package com.cg.moneymoneybank.transactionservice.service;

import java.util.List;

import com.cg.moneymoneybank.transactionservice.entity.Transaction;

public interface TransactionService {

	Double fundTransfer(int senderAccountNumber, int receiverAccountNumber, double amount);

	Double deposit(int accountNumber, String transactionDetails, double currentbalance, double amount);

	Double withdraw(int accountNumber, String transactionDetails, double currentBalance, double amount);
	
	List<Transaction> getAlltransactions();
}
