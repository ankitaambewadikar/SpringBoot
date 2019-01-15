package com.cg.rest.restservicedemo.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cg.rest.restservicedemo.pojo.Employee;
import com.cg.rest.restservicedemo.service.EmployeeService;

@RestController
@RequestMapping("/employees") // addressable resource
public class EmployeeResource {

	@Autowired
	private EmployeeService service;

	@PostMapping // uniform Constraint interface
	public void addnewEmployee(@RequestBody Employee employee) {
		service.addNewEmployee(employee);

	}

	// @RequestMapping(method = RequestMethod.GET, produces = { "application/json",
	// "application/xml" })
	@GetMapping // Uniform Constriant interface
	public List<Employee> getAllEmployees() {
		return service.getAllEmployees();
	}
}
