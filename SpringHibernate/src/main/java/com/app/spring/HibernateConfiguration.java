package com.app.spring;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.dialect.MySQL5Dialect;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
//<context:componentScan basePackage=""/>
@ComponentScan(basePackages="com.app.spring")
// <tx:annotation-driven/>
@EnableTransactionManagement

//<aop:aspectj-autoproxy/>
@EnableAspectJAutoProxy
public class HibernateConfiguration {

	@Bean
	public DataSource dataSource(){
		DriverManagerDataSource dataSource=
				new DriverManagerDataSource();
dataSource.setDriverClassName("com.mysql.jdbc.Driver");
dataSource.setUrl("jdbc:mysql://localhost:3306/hibernate");
dataSource.setUsername("admin");
dataSource.setPassword("admin");		
		
		return dataSource;
	}

	@Bean
	public LocalSessionFactoryBean sessionFactoryBean() {
		Properties props = new Properties();
props.put("hibernate.dialect", MySQL5Dialect.class.getName());
props.put("hibernate.format_sql", "true");
props.put("hibernate.show_sql", "true");
props.put("hibernate.hbm2ddl.auto", "true");
LocalSessionFactoryBean bean=new LocalSessionFactoryBean();

		
		bean.setPackagesToScan(
			new String[]{"com.app.spring.model"});		
		bean.setHibernateProperties(props);
		bean.setDataSource(this.dataSource());
		//bean.setSchemaUpdate(true);
		return bean;
	}

	@Bean
	public HibernateTransactionManager transactionManager() {
		return new HibernateTransactionManager( sessionFactoryBean().getObject() );
	}

}
