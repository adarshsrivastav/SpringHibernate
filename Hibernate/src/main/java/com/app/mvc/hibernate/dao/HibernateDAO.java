package com.app.mvc.hibernate.dao;

import java.util.List;

public interface HibernateDAO<T, PK extends java.io.Serializable> {
	T save(T t);
	T update(T t);
	T find(PK id);
	void delete(T t);
	List<T> findAll();

}
