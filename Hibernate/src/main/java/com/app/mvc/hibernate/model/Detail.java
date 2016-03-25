package com.app.mvc.hibernate.model;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class Detail {
	
	@ManyToOne()
	@JoinColumn(insertable=false,updatable=false)
	private Master master;

}
