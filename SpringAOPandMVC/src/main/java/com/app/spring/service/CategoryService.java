package com.app.spring.service;

import java.util.List;

import com.app.spring.model.Category;

public interface CategoryService {
	
	Category save(Category category);
	Category update(Category category);
	Category find(Long categoryid);
	void delete(Category category);
	List<Category> getAll();
}
