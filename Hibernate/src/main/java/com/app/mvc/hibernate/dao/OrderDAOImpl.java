package com.app.mvc.hibernate.dao;

import java.util.List;

//import javax.transaction.Transaction;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

//import org.springframework.stereotype.Repository;

import com.app.mvc.hibernate.model.Order;


public class OrderDAOImpl implements OrderDAO {

	private Session session;
	@Override
	public Order create(Order order) {
		Transaction trxn=session.getTransaction();
		try {			
			trxn.begin();
			session.save(order);
			trxn.commit();			
				} catch (HibernateException e) {
					e.printStackTrace();
					trxn.rollback();
				}
		return order;
	}

	@Override
	public Order update(Order order) {
		// TODO Auto-generated method stub
		Transaction trxn=session.getTransaction();
		try {			
			trxn.begin();
			session.update(order);
			trxn.commit();			
				} catch (HibernateException e) {
					e.printStackTrace();
					trxn.rollback();
				}
		return order;
	}

	@Override
	public Order find(Long orderId) {
		// TODO Auto-generated method stub
		return (Order)session.get(Order.class, orderId);
	}

	@Override
	public List<Order> findAll() {
		// TODO Auto-generated method stub
		return session.createCriteria(Order.class).list();
	}

	@Override
	public List<Order> searchByName(String orderName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Order> searchByDate(String orderDate) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setsession(Session session) {
		// TODO Auto-generated method stub
		this.session=session;

	}

	@Override
	public void delete(Order order) {
		// TODO Auto-generated method stub
		Transaction trxn=session.getTransaction();
		try {			
			trxn.begin();
			session.delete(order);
			trxn.commit();			
				} catch (HibernateException e) {
					e.printStackTrace();
					trxn.rollback();
				}
		
	}

}
