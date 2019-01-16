package com.cg.rest.restserviceemployee.service;

import java.util.List;

import com.cg.rest.restserviceemployee.pojo.EmployeeTwo;

public interface EmployeeNewService {

	void addNewEmployee(EmployeeTwo employee);

	List<EmployeeTwo> getAllEmployees();

	void updateEmployee(EmployeeTwo employee);

	void deleteEmployee(int empId);

	EmployeeTwo getEmployeeById(int empId);

}