package com.app.mvc.hibernate.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="HIB_CATEGORY")
public class Category {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="CATEGORY_ID")
	private Long id;
	
	@Column(name="CATEGORY_NAME")
	private String name;
	
@ManyToMany(cascade=CascadeType.ALL,
fetch=FetchType.EAGER)
@JoinTable(name="HIB_CATEGORY_ITEMS",
joinColumns={@JoinColumn(name="CATEGORY_ID")},
inverseJoinColumns={@JoinColumn(name="ITEM_ID")})
private Set<Item> items=new HashSet<>();

public Category() {

}

public Category(String name) {
	this.name = name;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public Set<Item> getItems() {
	return items;
}

public void setItems(Set<Item> items) {
	this.items = items;
}

public Long getId() {
	return id;
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((id == null) ? 0 : id.hashCode());
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	return result;
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (!(obj instanceof Category))
		return false;
	Category other = (Category) obj;
	if (id == null) {
		if (other.id != null)
			return false;
	} else if (!id.equals(other.id))
		return false;
	if (name == null) {
		if (other.name != null)
			return false;
	} else if (!name.equals(other.name))
		return false;
	return true;
}

@Override
public String toString() {
	StringBuilder builder = new StringBuilder();
	builder.append("Category [id=");
	builder.append(id);
	builder.append(", name=");
	builder.append(name);
	builder.append("]");
	return builder.toString();
}


	

}
