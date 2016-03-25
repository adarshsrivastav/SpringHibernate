package com.app.mvc.hibernate.client;

import java.util.Set;

import com.app.mvc.hibernate.dao.ItemDAO;
import com.app.mvc.hibernate.dao.ItemDAOImpl;
import com.app.mvc.hibernate.model.Bid;
import com.app.mvc.hibernate.model.Item;
import com.app.mvc.hibernate.template.Hibernatetemplate;

public class ItemClient1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Item item1=new Item("Desktop3");
		item1.getImages().add("orange");
		item1.getImages().add("Green");
		item1.getImages().add("Black");
		
		ItemDAO dao =new ItemDAOImpl(Hibernatetemplate.getSession());
		//dao.save(item1);
		
		Item item2=dao.find(1L);
		//dao.delete(item2);
	//	/*
		Bid bid1=new Bid("Bidder1", 1735.0);
		bid1.addBidToItem(item2);
		
		Bid bid2=new Bid("Bidder2", 1835.0);
		bid2.addBidToItem(item2);
		
		item2.getBids().add(bid1);
		item2.getBids().add(bid2);
		
		//dao.update(item2);
	//	*/
	//	/*
		Set<String> images=item2.getImages();
		for(String image:images)
			System.out.println(image);
		//*/

	}

}
