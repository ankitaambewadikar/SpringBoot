package com.cg.rest.restserviceemployee;

import org.springframework.boot.CommandLineRunner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.cg.rest.restserviceemployee.pojo.Addressess;
import com.cg.rest.restserviceemployee.pojo.EmployeeTwo;
import com.cg.rest.restserviceemployee.repository.EmployeeNewRepository;

@SpringBootApplication

public class RestServiceEmployeeApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestServiceEmployeeApplication.class, args);
	}
	

	@Bean
	public CommandLineRunner populateData(EmployeeNewRepository repository ) {
		return (args) -> {
			repository.save(new EmployeeTwo(101,"Ankita",5000,new Addressess("12","Sundram","pradhikaran","pune","411044")));
			repository.save(new EmployeeTwo(102,"Ankita",5000,new Addressess("12","Sundram","pradhikaran","pune","411044")));
			repository.save(new EmployeeTwo(103,"Ankita",5000,new Addressess("12","Sundram","pradhikaran","pune","411044")));
			repository.save(new EmployeeTwo(104,"Ankita",5000,new Addressess("12","Sundram","pradhikaran","pune","411044")));
	};

}
}