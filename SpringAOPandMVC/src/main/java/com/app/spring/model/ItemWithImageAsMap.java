package com.app.spring.model;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapKeyColumn;
import javax.persistence.Table;

@Entity
@Table(name="HIB_ITEM1")
public class ItemWithImageAsMap {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ITEM_ID")
	private Long id;
	
	@Column(name="ITEM_NAME")
	private String name;
	
	@ElementCollection()
	@CollectionTable(name="HIB_ITEM_IMAGES_MAP",
	joinColumns={@JoinColumn(name="ITEM_ID")})
	@Column(name="FILE_NAME")
	@MapKeyColumn(name="IMAGE_MAP_KEY")
	private Map<String,String> images=new HashMap<>();
	
	 public ItemWithImageAsMap() {
		// TODO Auto-generated constructor stub
	} 

	public ItemWithImageAsMap(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	public Long getId() {
		return id;
	}

	public Map<String, String> getImages() {
		return images;
	}

	public void setImages(Map<String, String> images) {
		this.images = images;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof ItemWithImageAsMap))
			return false;
		ItemWithImageAsMap other = (ItemWithImageAsMap) obj;
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
		builder.append("Item [id=");
		builder.append(id);
		builder.append(", name=");
		builder.append(name);
		builder.append("]");
		return builder.toString();
	}
	
	
		

}
