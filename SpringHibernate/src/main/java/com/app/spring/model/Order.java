package com.app.spring.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="HIB_ORDER")
public class Order {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ORDER_ID")
	private Long orderid;
	
	@Column(name="ORDER_NAME")
	private String name;
	
	@Column(name="ORDER_DATE")
	@Temporal(TemporalType.DATE)
	private Date orderDate;
	
	@Column(name="ORDER_VALUE")
	private Double orderValue;
	
	public Order() {
	
	}

	public Order(String name, Date orderDate, Double orderValue) {
		this.name = name;
		this.orderDate = orderDate;
		this.orderValue = orderValue;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public Double getOrderValue() {
		return orderValue;
	}

	public void setOrderValue(Double orderValue) {
		this.orderValue = orderValue;
	}

	public Long getOrderid() {
		return orderid;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((orderid == null) ? 0 : orderid.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Order))
			return false;
		Order other = (Order) obj;
		if (orderid == null) {
			if (other.orderid != null)
				return false;
		} else if (!orderid.equals(other.orderid))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Order [orderid=");
		builder.append(orderid);
		builder.append(", name=");
		builder.append(name);
		builder.append(", orderDate=");
		builder.append(orderDate);
		builder.append(", orderValue=");
		builder.append(orderValue);
		builder.append("]");
		return builder.toString();
	}	

}
