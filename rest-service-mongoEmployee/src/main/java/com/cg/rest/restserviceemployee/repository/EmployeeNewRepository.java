package com.cg.rest.restserviceemployee.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.cg.rest.restserviceemployee.pojo.EmployeeTwo;

@Repository
public interface EmployeeNewRepository extends MongoRepository<EmployeeTwo, Integer> {

}
