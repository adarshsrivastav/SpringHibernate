package com.app.mvc.hibernate.dao;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import com.app.mvc.hibernate.model.Category;

@Repository
public  class CategoryDAOImpl extends HibernateDAOImpl<Category, Long> implements CategoryDAO {

	public CategoryDAOImpl(Session session) {
	super(session);
	}	

}
