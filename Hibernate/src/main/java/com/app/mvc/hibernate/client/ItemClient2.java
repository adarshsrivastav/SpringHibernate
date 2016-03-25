package com.app.mvc.hibernate.client;

import java.util.Set;

import com.app.mvc.hibernate.dao.ItemDAO;
import com.app.mvc.hibernate.dao.ItemDAOImpl;
import com.app.mvc.hibernate.model.Address;
import com.app.mvc.hibernate.model.Bid;
import com.app.mvc.hibernate.model.Item;
import com.app.mvc.hibernate.template.Hibernatetemplate;

public class ItemClient2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Item item1=new Item("Desktop3");
		item1.getImages().add("orange");
		item1.getImages().add("Green");
		item1.getImages().add("Black");
		*/
		ItemDAO dao =new ItemDAOImpl(Hibernatetemplate.getSession());
		//dao.save(item1);
		
		Item item2=dao.find(2L);
		//dao.delete(item2);
	//	/*
		Bid bid1=new Bid("Bidder3", 1935.0);
		bid1.addBidToItem(item2);
		Address addres1=new Address();
		addres1.setCity("Bangalore");
		addres1.setEmail("a@test.com");
		addres1.setStreetName("MacRoad");
		addres1.setBid(bid1);
		bid1.setAddress(addres1);
		
		Bid bid2=new Bid("Bidder4", 2035.0);
		bid2.addBidToItem(item2);
		Address addres2=new Address();
		addres2.setCity("Bangalore");
		addres2.setEmail("b@test.com");
		addres2.setStreetName("MacRoad");
		addres2.setBid(bid2);
		//bid1.setAddress(addres2);
		bid2.setAddress(addres2);
		
		item2.getBids().add(bid1);
		item2.getBids().add(bid2);
		
		dao.update(item2);
	//	*/
		/*
		Set<String> images=item2.getImages();
		for(String image:images)
			System.out.println(images);
		*/

	}

}
