package com.app.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.spring.model.Customer;
import com.app.spring.model.CustomerInterface;
import com.app.spring.repository.CustomerRepository;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepository customerRepository;
	
	@Transactional
	public CustomerInterface save(CustomerInterface student) {
		return customerRepository.save((Customer)student);
	}

	public boolean findByLogin(String userName, String password) {	
		CustomerInterface stud = customerRepository.findByUserName(userName);
		
		if(stud != null && stud.getPassword().equals(password)) {
			return true;
		} 
		
		return false;		
	}

	public boolean findByUserName(String userName) {
		CustomerInterface stud = customerRepository.findByUserName(userName);
		
		if(stud != null) {
			return true;
		}
		
		return false;
	}
}
