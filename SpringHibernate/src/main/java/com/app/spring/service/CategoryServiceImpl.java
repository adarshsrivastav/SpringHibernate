package com.app.spring.service;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.app.spring.dao.CategoryDAO;
import com.app.spring.model.Category;

@Service
@Scope("prototype")
public class CategoryServiceImpl implements CategoryService {
	
	@Autowired
	@Qualifier("categoryDAOImpl1")
	private CategoryDAO dao;
	
	@PostConstruct
	public void initialize(){
		System.out.println("Inside Init");
	}
	
	@PreDestroy
	public void destroy(){
		System.out.println("Inside Destroy");
	}

	@Override
	public Category save(Category category) {		
		return dao.save(category);
	}

	@Override
	public Category update(Category category) {		
		return dao.update(category);
	}

	@Override
	public Category find(Long categoryid) {
		return dao.find(categoryid);
	}

	@Override
	public void delete(Category category) {
		dao.delete(category);
	}

	@Override
	public List<Category> getAll() {		
		return dao.findAll();
	}

}
