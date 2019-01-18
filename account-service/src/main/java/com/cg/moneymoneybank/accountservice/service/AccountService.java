package com.cg.moneymoneybank.accountservice.service;

import java.util.List;
import java.util.Optional;

import com.cg.moneymoneybank.accountservice.entity.Account;

public interface AccountService {

	void addNewAccount(Account account);
	
	void updateBalance(Account account);
	
	Optional<Account> getAccountById(int accountNumber);
	
	List<Account> getAllAccounts();
	
	void deleteAccount(int accountNumber);
}