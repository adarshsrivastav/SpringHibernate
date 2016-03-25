package com.app.mvc.hibernate.dao;

import java.util.List;

import org.hibernate.Session;

import com.app.mvc.hibernate.model.Order;

public interface OrderDAO {
	
	Order create(Order order);
	Order update(Order order);
	Order find(Long orderId);
	
	List<Order> findAll();
	List<Order> searchByName(String orderName);
	List<Order> searchByDate(String orderDate);
	
	void setsession(Session session);
	void delete(Order order);
	
	

}
