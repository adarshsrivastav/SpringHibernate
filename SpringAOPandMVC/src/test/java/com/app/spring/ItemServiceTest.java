package com.app.spring;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.app.spring.aop.SecurityManagerBean;
import com.app.spring.service.CategoryService;

@ContextConfiguration(classes=HibernateConfiguration.class)
@RunWith(SpringJUnit4ClassRunner.class)

public class ItemServiceTest {
	
	@Autowired
	private CategoryService service;
	
	@Autowired
	private SecurityManagerBean securityManagerBean;
	
	
	
	@Test
	public void testFindCategoryById(){
		securityManagerBean.login("admin", "pass");
		Assert.assertNotNull(service.find(1L));		
	}	
	

}
