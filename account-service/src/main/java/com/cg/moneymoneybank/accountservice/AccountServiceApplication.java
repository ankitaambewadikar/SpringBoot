package com.cg.moneymoneybank.accountservice;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;

import com.cg.moneymoneybank.accountservice.entity.CurrentAccount;
import com.cg.moneymoneybank.accountservice.entity.SavingsAccount;
import com.cg.moneymoneybank.accountservice.repository.AccountRepository;
import com.cg.moneymoneybank.accountservice.service.AccountService;

@SpringBootApplication
public class AccountServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountServiceApplication.class, args);
	}

	@Bean
	public CommandLineRunner addNewData(AccountService service) {
		return (evt) -> {

			service.addNewAccount(new SavingsAccount(101, "Ankita Ambewadikar", 8500.00, true));
			service.addNewAccount(new SavingsAccount(102, "Deepika Bachhav", true));
			service.addNewAccount(new SavingsAccount(103, "Rohan Bhosale", 9000.00, true));
			service.addNewAccount(new SavingsAccount(104, "Tejas Khandagale", 1500.00, false));
			service.addNewAccount(new SavingsAccount(105, "Shubham Bhatt", 6500.00, true));
			service.addNewAccount(new SavingsAccount(106, "Tushar Deore", 4500.00, true));
			service.addNewAccount(new CurrentAccount(107, "ShaliMi", 7852.00, 1000.00));
		};
	}

}
