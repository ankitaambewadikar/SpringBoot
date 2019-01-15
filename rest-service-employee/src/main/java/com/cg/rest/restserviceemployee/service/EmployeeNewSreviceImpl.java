package com.cg.rest.restserviceemployee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.rest.restserviceemployee.pojo.EmployeeTwo;
import com.cg.rest.restserviceemployee.repository.EmployeeNewRepository;

@Service
public class EmployeeNewSreviceImpl implements EmployeeNewService {

	@Autowired
	private EmployeeNewRepository repository;

	@Override
	public void addNewEmployee(EmployeeTwo employee) {

		repository.save(employee);
	}

	@Override
	public List<EmployeeTwo> getAllEmployees() {

		return repository.findAll();
	}

	@Override
	public void updateEmployee(EmployeeTwo employee) {
		repository.save(employee);

	}

	@Override
	public void deleteEmployee(int empId) {
		EmployeeTwo employee = repository.getOne(empId);
		repository.delete(employee);

	}

	@Override
	public EmployeeTwo getEmployeeById(int empId) {

		EmployeeTwo employee = repository.findById(empId).get();
		return employee;

	}

}
