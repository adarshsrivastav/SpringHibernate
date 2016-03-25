package com.app.mvc.hibernate.template;

//import javax.imageio.spi.ServiceRegistry;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
public class Hibernatetemplate {
	
	private static Configuration configuration=new Configuration().configure();
	private static SessionFactory sessionFactory;
	private static ThreadLocal<Session> threadLocal=new ThreadLocal<Session>();
	
	static
	{
		ServiceRegistry registry=new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();
		sessionFactory=configuration.configure().buildSessionFactory(registry);
	}
	
	public static Session getSession(){
		Session session=threadLocal.get();
		if(session==null||!session.isOpen())
		{
			session=sessionFactory.openSession();
			threadLocal.set(session);
		}
		return session;
	}
	

}
