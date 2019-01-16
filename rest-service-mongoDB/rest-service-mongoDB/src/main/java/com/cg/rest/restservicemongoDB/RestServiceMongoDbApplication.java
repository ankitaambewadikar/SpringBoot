package com.cg.rest.restservicemongoDB;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.cg.rest.restservicemongoDB.pojo.Customer;
import com.cg.rest.restservicemongoDB.repository.CustomerRepository;

@ComponentScan(basePackages = "com")
@SpringBootApplication
public class RestServiceMongoDbApplication implements CommandLineRunner {

	@Autowired
	private CustomerRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(RestServiceMongoDbApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		repository.deleteAll();

		repository.save(new Customer("Ankita", "Ambewadikar"));
		repository.save(new Customer("Deepika", "Bachhav"));
		repository.save(new Customer("Tejas", "Khandagale"));
		repository.save(new Customer("Rohan", "Bhosale"));
		repository.save(new Customer("Shubham", "Bhatt"));
		repository.save(new Customer("Tushar", "Deore"));

		System.out.println("Customers found with findAll():");
		System.out.println("-------------------------------");
		for (Customer customer : repository.findAll()) {
			System.out.println(customer);
		}
		System.out.println();

		System.out.println("Customer found with findByFirstName('Ankita'):");
		System.out.println("--------------------------------");
		System.out.println(repository.findByFirstName("Ankita"));

		System.out.println("--------------------------------");
		for (Customer customer : repository.findByLastName("Ambewadikar")) {
			System.out.println(customer);
		}

	}

}
