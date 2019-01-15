package com.cg.rest.restserviceemployee.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.rest.restserviceemployee.pojo.EmployeeTwo;

@Repository
public interface EmployeeNewRepository extends JpaRepository<EmployeeTwo, Integer> {

}
