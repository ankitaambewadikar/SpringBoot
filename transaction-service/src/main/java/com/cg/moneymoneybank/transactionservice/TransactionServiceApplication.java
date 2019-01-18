package com.cg.moneymoneybank.transactionservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cg.moneymoneybank.transactionservice.entity.Transaction;
import com.cg.moneymoneybank.transactionservice.repository.TransactionRepository;

@SpringBootApplication
public class TransactionServiceApplication implements CommandLineRunner {

	@Autowired
	private TransactionRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(TransactionServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		repository.save(new Transaction(101,14000.00,"credit","Deposit in Bank"));
		repository.save(new Transaction(102,15000.00,"credit","Deposit in Bank"));
		repository.save(new Transaction(103,12000.00,"credit","Deposit in Bank"));
		repository.save(new Transaction(104,4000.00,"credit","Deposit in Bank"));
	}

}
