package com.app.mvc.hibernate.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

public class Master {
	
/*	@OneToMany
	@JoinColumn(name="MASTER_ID")
	Set<Detail> details=new HashSet<>();
*/
	
	@OneToMany(mappedBy="master")	
	Set<Detail> details=new HashSet<>();
}
