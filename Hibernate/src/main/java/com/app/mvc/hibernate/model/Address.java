package com.app.mvc.hibernate.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
@Table(name="BID_ADDRESS",uniqueConstraints=
{@UniqueConstraint(columnNames="email",name="email")})

public class Address {
	
	@Id
	@GeneratedValue(generator="customFKGenerator")
	@GenericGenerator(strategy="foreign",
	name="customFKGenerator",
	parameters=@Parameter(name="property",
	value="bid"))
	private Long id;
	
	@OneToOne
	@PrimaryKeyJoinColumn
	private Bid bid;
	
	private String email;
	
	private String streetName,city;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Bid getBid() {
		return bid;
	}

	public void setBid(Bid bid) {
		this.bid = bid;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}	
	
	

}
