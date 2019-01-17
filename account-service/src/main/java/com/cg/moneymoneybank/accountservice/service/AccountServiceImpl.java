package com.cg.moneymoneybank.accountservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.moneymoneybank.accountservice.entity.Account;
import com.cg.moneymoneybank.accountservice.repository.AccountRepository;

@Service
public class AccountServiceImpl implements AccountService {

	@Autowired
	private AccountRepository repository;

	@Override
	public void addNewAccount(Account account) {
		repository.save(account);
	}

	@Override
	public Account getAccountById(int accountNumber) {
		Account account = repository.findById(accountNumber).get();
		return account;
	}

	@Override
	public List<Account> getAllAccounts() {

		return repository.findAll();
	}

	@Override
	public void updateBalance(Account account) {

		repository.save(account);
	}

	@Override
	public void deleteAccount(int accountNumber) {

		Account account = repository.findById(accountNumber).get();
		repository.delete(account);
	}

}
