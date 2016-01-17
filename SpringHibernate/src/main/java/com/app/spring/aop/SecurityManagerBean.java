package com.app.spring.aop;

import org.springframework.stereotype.Component;

@Component
public class SecurityManagerBean {
	private static ThreadLocal<LoginBean> threadLocal=
			new ThreadLocal<>();
	
	
public void login(String username,String password){
	LoginBean loginBean=threadLocal.get();
	if(loginBean==null){
		loginBean=new LoginBean(username, password);
		threadLocal.set(loginBean);
	}		
	}
public LoginBean getLoggedInUser(){
	return threadLocal.get();
}
public void logout(){
	LoginBean loginBean=threadLocal.get();
	if(loginBean!=null)
		threadLocal.remove();	
}

}
