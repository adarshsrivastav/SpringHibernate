package com.app.spring.dao;

import org.springframework.stereotype.Repository;

import com.app.spring.model.Category;

@Repository
public  class CategoryDAOImpl extends HibernateDAOImpl<Category, Long> implements CategoryDAO {

	public CategoryDAOImpl() {
	super(Category.class);
	}	

}
