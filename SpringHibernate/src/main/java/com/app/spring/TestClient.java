package com.app.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.spring.service.CategoryService;

public class TestClient {

	public static void main(String[] args) {
		
		//ApplicationContext ioc=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		ApplicationContext ioc=
new AnnotationConfigApplicationContext
(HibernateConfiguration.class);
		CategoryService service=ioc.getBean(CategoryService.class);
		service.find(1L);

	}

}
