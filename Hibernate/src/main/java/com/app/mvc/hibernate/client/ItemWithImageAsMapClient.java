package com.app.mvc.hibernate.client;

import com.app.mvc.hibernate.dao.ItemWithImageAsMapDAO;
import com.app.mvc.hibernate.dao.ItemWithImageAsMapDAOImpl;
import com.app.mvc.hibernate.model.ItemWithImageAsMap;
import com.app.mvc.hibernate.template.Hibernatetemplate;

public class ItemWithImageAsMapClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ItemWithImageAsMap item1=new ItemWithImageAsMap("Mobile");
		item1.getImages().put("Key1","val1");
		item1.getImages().put("Key2","val2");
		item1.getImages().put("Key3","val3");
		item1.getImages().put("Key4","val4");
		
		ItemWithImageAsMapDAO dao=new ItemWithImageAsMapDAOImpl(Hibernatetemplate.getSession());
		dao.save(item1);

	}

}
