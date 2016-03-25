package com.app.spring.dao;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Repository
public  class HibernateDAOImpl<T, PK extends java.io.Serializable> implements HibernateDAO<T, PK> {

	// Dependency Injection
	@Autowired
	private SessionFactory sessionFactory;
	
	protected Class<T> entityClass;
	
	public HibernateDAOImpl() {		
			
	}
	
	public HibernateDAOImpl(Class<T> entityClass) {
		this.entityClass=entityClass;
			
	}	

	@Override
	@Transactional(propagation=Propagation.REQUIRED)
	public T save(T t) {			
	sessionFactory.getCurrentSession().save(t);
		return t;
	}

	@Override
	@Transactional(propagation=Propagation.REQUIRED)
	public T update(T t) {
	/*	Transaction trxn=session.getTransaction();
		try {			
			trxn.begin();
			session.update(t);
			trxn.commit();			
				} catch (HibernateException e) {
					e.printStackTrace();
					trxn.rollback();
				}				
*/	
		sessionFactory.getCurrentSession().update(t);
		
		return t;
	}

	@Override
	@Transactional
	public T find(PK id) {		
return (T)sessionFactory.getCurrentSession().get(entityClass, id);
	}

	@Override
	@Transactional(propagation=Propagation.REQUIRED)
	public void delete(T t) {
	sessionFactory.getCurrentSession().delete(t);	
	}

	@Override
	public List<T> findAll() {
		
return sessionFactory.getCurrentSession().createCriteria(entityClass).list();
	}

}
