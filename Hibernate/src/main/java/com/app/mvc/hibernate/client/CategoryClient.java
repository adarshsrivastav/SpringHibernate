package com.app.mvc.hibernate.client;



import java.util.Set;

import com.app.mvc.hibernate.dao.CategoryDAO;
import com.app.mvc.hibernate.dao.CategoryDAOImpl;
import com.app.mvc.hibernate.dao.ItemDAO;
import com.app.mvc.hibernate.dao.ItemDAOImpl;
import com.app.mvc.hibernate.model.Category;
import com.app.mvc.hibernate.model.Item;
import com.app.mvc.hibernate.template.Hibernatetemplate;

public class CategoryClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ItemDAO itemDAO=new ItemDAOImpl(Hibernatetemplate.getSession());
		Item item=itemDAO.find(5L);
		
		CategoryDAO categoryDAO=new CategoryDAOImpl(Hibernatetemplate.getSession());
		Category category=new Category("HomeElectronics");
		category.getItems().add(item);
		
		categoryDAO.save(category);
		
		/*
		 Set<Item> set=categoryDAO.find(1L).getItems();
		 for(Item items:set)
		 	System.out.println(items);
	 */

	}

}
