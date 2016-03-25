package com.app.mvc.hibernate.dao;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
//import org.springframework.transaction.annotation.Propagation;
//import org.springframework.transaction.annotation.Transactional;

//@Repository
public  class HibernateDAOImpl<T, PK extends java.io.Serializable> implements HibernateDAO<T, PK> {

	// Dependency Injection
	//@Autowired
	//private SessionFactory sessionFactory;
	private Session session;
	protected Class<T> entityClass;
	
	public HibernateDAOImpl() {		
			
	}
	
	public HibernateDAOImpl(Session session) {
		super();
		this.session=session;
		ParameterizedType genericSuperClass=(ParameterizedType)getClass().getGenericSuperclass();
		this.entityClass=(Class<T>) genericSuperClass.getActualTypeArguments()[0];
			
	}	

	//@Override
	//@Transactional(propagation=Propagation.REQUIRED)
	public T save(T t) {	
		Transaction trxn=session.getTransaction();
		try {			
			trxn.begin();
			session.save(t);
			trxn.commit();			
				} catch (HibernateException e) {
					e.printStackTrace();
					trxn.rollback();
				}
	//sessionFactory.getCurrentSession().save(t);
		return t;
	}

	//@Override
	//@Transactional(propagation=Propagation.REQUIRED)
	public T update(T t) {
		Transaction trxn=session.getTransaction();
		try {			
			trxn.begin();
			session.update(t);
			trxn.commit();			
				} catch (HibernateException e) {
					e.printStackTrace();
					trxn.rollback();
				}				
	
	//	sessionFactory.getCurrentSession().update(t);
		
		return t;
	}

	//@Override
	//@Transactional
	public T find(PK id) {		
//return (T)sessionFactory.getCurrentSession().get(entityClass, id);
		return (T)session.get(entityClass, id);
	}

	//@Override
	//@Transactional(propagation=Propagation.REQUIRED)
	public void delete(T t) {
		Transaction trxn=session.getTransaction();
		try {			
			trxn.begin();
			session.delete(t);
			trxn.commit();			
				} catch (HibernateException e) {
					e.printStackTrace();
					trxn.rollback();
				}	
	//sessionFactory.getCurrentSession().delete(t);	
	}

	@Override
	public List<T> findAll() {
		return session.createCriteria(entityClass).list();
//return sessionFactory.getCurrentSession().createCriteria(entityClass).list();
	}

}
