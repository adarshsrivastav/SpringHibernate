package com.app.spring.client;

import org.springframework.aop.support.AopUtils;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.spring.dao.CategoryDAO;
import com.app.spring.service.CategoryService;

public class SpringClient1 {

	public static void main(String[] args) {
		AbstractApplicationContext ioc=
new ClassPathXmlApplicationContext("applicationContext.xml");
		ioc.registerShutdownHook();
CategoryService categoryService=
ioc.getBean(CategoryService.class);

CategoryService categoryService1=
ioc.getBean(CategoryService.class);

System.out.println("categoryService==categoryService1 "+
(categoryService==categoryService1));
;
CategoryDAO categoryDAO=
(CategoryDAO)ioc.getBean("categoryDAOImpl1");

System.out.println("AOP Proxy "+AopUtils.isAopProxy(categoryDAO));
System.out.println("JDK Proxy "+AopUtils.isJdkDynamicProxy(categoryDAO));
System.out.println("CGLIB Proxy "
+AopUtils.isCglibProxy(categoryDAO));

System.out.println(categoryService.find(1L).getItems());
while(true){
	
}

	}

}
