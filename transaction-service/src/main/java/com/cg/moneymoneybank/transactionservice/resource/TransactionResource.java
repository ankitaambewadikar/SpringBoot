package com.cg.moneymoneybank.transactionservice.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.cg.moneymoneybank.transactionservice.entity.Transaction;
import com.cg.moneymoneybank.transactionservice.service.TransactionService;

@RestController
@RequestMapping("/transactions")
public class TransactionResource {

	@Autowired
	private TransactionService service;

	private RestTemplate template;

	@GetMapping
	public List<Transaction> getAllTransactions() {

		return service.getAlltransactions();

	}

	@PostMapping
	public ResponseEntity<Transaction> deposit(@RequestBody Transaction transction) {
		ResponseEntity<Double> entity = template.getForEntity(
				"http://localhost:8080/accounts/" + transction.getAccountNumber() + "/balance", Double.class);
		Double currentBalance = entity.getBody();
		Double updateBalance = service.deposit(transction.getAccountNumber(), transction.getTransactionDetails(),
				transction.getCurrentBalance(), transction.getAmount());
		template.put(
				"http://localhost:8080/accounts/" + transction.getAccountNumber() + "?currentBalance=" + updateBalance,
				null);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}
}
