package com.cg.rest.restservicemongoDB.pojo;

import org.springframework.data.annotation.Id;


public class Customer {

	@Id
	private String customerId;
	private String firstName;
	private String lastName;

	public Customer(String firstName, String lastName) {

		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}

}
