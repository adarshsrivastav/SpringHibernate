package com.app.mvc.hibernate.client;

import java.util.Date;
import java.util.List;

import com.app.mvc.hibernate.dao.OrderDAO;
import com.app.mvc.hibernate.dao.OrderDAOImpl;
import com.app.mvc.hibernate.model.Order;
import com.app.mvc.hibernate.template.Hibernatetemplate;

public class OrderClient1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OrderDAO dao=new OrderDAOImpl();
		dao.setsession(Hibernatetemplate.getSession());
		
		Order order1=new Order("Items",new Date(),1238.0);
		//dao.create(order1);
		//order1=dao.find(2L);
		order1.setName("Food Items");
		
		//dao.update(order1);
		
		List<Order> orders=dao.findAll();
		for(Order order:orders)
			System.out.println(order);
	}

}
