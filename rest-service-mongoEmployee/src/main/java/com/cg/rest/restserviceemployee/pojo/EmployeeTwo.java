package com.cg.rest.restserviceemployee.pojo;

import org.springframework.data.annotation.Id;


public class EmployeeTwo {

	@Id
	private int empId;
	private String empName;
	private double salary;

	private Addressess address;

	public EmployeeTwo(int empId, String empName, double salary, Addressess address) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
		this.address = address;
	}

	public EmployeeTwo() {

	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Addressess getAddress() {
		return address;
	}

	public void setAddress(Addressess address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "EmployeeTwo [empId=" + empId + ", empName=" + empName + ", salary=" + salary + ", address=" + address
				+ "]";
	}
}
