package com.cg.rest.restservicedemo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.rest.restservicedemo.pojo.Employee;
@Service
public interface EmployeeService {

	void addNewEmployee(Employee employee);

	List<Employee> getAllEmployees();

}
