package com.app.spring.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class SecurityAspect {
	
	@Autowired
	private SecurityManagerBean securityManagerBean;
	
	@Before(value="execution(* com.app.spring.service.CategoryService.*(..))")
	public void validate(){
		
		LoginBean loginBean=
		securityManagerBean.getLoggedInUser();
		if(loginBean==null){
	throw new SecurityException(
			"U Must To Login To Access The Methods");
		}
		else{
	if(loginBean.getUsername().equals("admin")&&
			loginBean.getPassword().equals("pass")){
		System.out.println("Welcome User "+
			loginBean.getUsername());
	}
	else
throw new SecurityException("Invalid Username/password");
		}
		
	}

}
