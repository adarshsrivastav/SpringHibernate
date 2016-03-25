package com.app.spring.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="HIB_BID")
public class Bid {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="BIDDER_ID")
	private Long id;
	
	@Column(name="BIDDER_NAME")
	private String name;
	
	@Column(name="BID_VALUE")
	private Double bidValue;
	
	@ManyToOne
	@JoinColumn(name="ITEM_ID",nullable=false)
	private Item item;
	
	
	@OneToOne(cascade=CascadeType.ALL,
	fetch=FetchType.EAGER,mappedBy="bid")
	private Address address;
	
	public Bid() {
	
	}

	public Bid(String name, Double bidValue) {
		this.name = name;
		this.bidValue = bidValue;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getBidValue() {
		return bidValue;
	}

	public void setBidValue(Double bidValue) {
		this.bidValue = bidValue;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}
	

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bidValue == null) ? 0 : bidValue.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Bid))
			return false;
		Bid other = (Bid) obj;
		if (bidValue == null) {
			if (other.bidValue != null)
				return false;
		} else if (!bidValue.equals(other.bidValue))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Bid [id=");
		builder.append(id);
		builder.append(", name=");
		builder.append(name);
		builder.append(", bidValue=");
		builder.append(bidValue);
		builder.append("]");
		return builder.toString();
	}
	
	public void addBidToItem(Item item){
		if(item==null)
			return ;		
		this.item=item;
		item.getBids().add(this);		
	}
	
		

}
