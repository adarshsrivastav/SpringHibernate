package com.app.spring.service;

import com.app.spring.model.CustomerInterface;

public interface CustomerService {
	CustomerInterface save(CustomerInterface customer);
	boolean findByLogin(String userName, String password);
	boolean findByUserName(String userName);
}
