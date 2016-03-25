package com.app.mvc.hibernate.dao;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import com.app.mvc.hibernate.model.Item;

@Repository
public class ItemDAOImpl extends HibernateDAOImpl<Item, Long> implements ItemDAO {

	
public ItemDAOImpl(Session session) {
	// TODO Auto-generated constructor stub
	super(session);
}
	
}
