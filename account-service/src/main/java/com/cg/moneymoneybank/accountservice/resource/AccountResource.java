package com.cg.moneymoneybank.accountservice.resource;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cg.moneymoneybank.accountservice.entity.Account;
import com.cg.moneymoneybank.accountservice.service.AccountService;

@RestController
@RequestMapping("/accounts")
public class AccountResource {

	@Autowired
	private AccountService service;

	@PostMapping
	public void addNewAccount(@RequestBody Account account) {
		service.addNewAccount(account);
	}

	@GetMapping
	public ResponseEntity<List<Account>> getAllAccounts() {
		List<Account> accounts = service.getAllAccounts();
		return new ResponseEntity<>(accounts, HttpStatus.OK);

	}

	@GetMapping("/{accountNumber}")
	public Account getAccountById(@PathVariable int accountNumber) {
		return service.getAccountById(accountNumber);
	}

	/*
	 * @GetMapping("/{accountNumber}") public ResponseEntity<Account>
	 * getAccountById(@PathVariable int accountNumber) { //Optional<Account>
	 * optionalAccount = service.getAccountById(accountNumber); //Account account =
	 * (Account) optionalAccount.get(); Account account =
	 * service.getAccountById(accountNumber); if (account == null) { return new
	 * ResponseEntity<Account>(account, HttpStatus.NOT_FOUND); }
	 * 
	 * return new ResponseEntity<Account>(account, HttpStatus.OK);
	 * 
	 * }
	 */

	@PutMapping("/{accountNumber}")
	public ResponseEntity<Account> updateBalance(@PathVariable int accountNumber,
			@RequestParam("balance") Double currentBalance) {

		Account account = service.getAccountById(accountNumber);

		if (account == null) {
			return new ResponseEntity<Account>(account, HttpStatus.NOT_FOUND);
		}
		currentBalance += account.getCurrentBalance();
		account.setCurrentBalance(currentBalance);
		service.updateBalance(account);
		return new ResponseEntity<Account>(account, HttpStatus.OK);

	}

	@DeleteMapping("/{accountNumber}")
	public void delete(@PathVariable int accountNumber) {
		service.deleteAccount(accountNumber);
	}
	@PutMapping("/{accountNumber}")
	public 
	
}
