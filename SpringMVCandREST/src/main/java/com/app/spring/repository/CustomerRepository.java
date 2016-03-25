package com.app.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.app.spring.model.Customer;
import com.app.spring.model.CustomerInterface;

@Repository("customerRepository")
public interface CustomerRepository extends JpaRepository<Customer, Long> {
	
	@Query("select s from Customer s where s.userName = :userName")
	CustomerInterface findByUserName(@Param("userName") String userName);
	
}
