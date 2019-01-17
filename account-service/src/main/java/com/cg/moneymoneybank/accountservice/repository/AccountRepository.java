package com.cg.moneymoneybank.accountservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.cg.moneymoneybank.accountservice.entity.Account;

@Repository
public interface AccountRepository extends MongoRepository<Account, Integer> {

}
