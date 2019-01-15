package com.cg.rest.restserviceemployee.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.rest.restserviceemployee.pojo.EmployeeTwo;
import com.cg.rest.restserviceemployee.service.EmployeeNewService;

@RestController
@RequestMapping("/employees")
public class EmployeeNewResource {

	@Autowired
	private EmployeeNewService service;

	@PostMapping
	public void addNewEmployee(@RequestBody EmployeeTwo employee) {
		service.addNewEmployee(employee);
	}

	@GetMapping
	public List<EmployeeTwo> getAllEmployees() {
		return service.getAllEmployees();

	}

	@PutMapping
	public void updateEmployee(@RequestBody EmployeeTwo employee) {
		service.updateEmployee(employee);
	}

	@DeleteMapping("/{empId}")
	public void delete(@PathVariable int empId) {
		service.deleteEmployee(empId);
	}

	@GetMapping("/{empId}")
	public EmployeeTwo getEmployeeById(@PathVariable int empId) {
		return service.getEmployeeById(empId);
	}
}
