
package com.app.mvc.hibernate.dao;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import com.app.mvc.hibernate.model.ItemWithImageAsMap;

@Repository
public class ItemWithImageAsMapDAOImpl extends HibernateDAOImpl<ItemWithImageAsMap, Long> implements ItemWithImageAsMapDAO {
	
public ItemWithImageAsMapDAOImpl(Session session) {
	// TODO Auto-generated constructor stub
	super(session);
}
	
}
