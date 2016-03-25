# SpringAOP and MVC
Basic Spring AOP and MVC concept used!


Springs gives us extra features like @Controller,@Repositiory,@Service,@Autowired,@Bean,@Transactional

Basic Spring MVC + Spring AOP + Hibernate ORM concepts used for storing the objects into table!

Whole project is divided into Component,Spring,AOP, DAO, Model and Service.

Componet: It contains the controller class which is the top layer in the hierarchy and map the url to its functionality.

Spring: Used to set the application context and get bean . Apart from this it also contain the programmatic way of setting the properties decalared in applicationContext.xml file.

AOP: Basic example of aspected oriented programming concept.

DAO Layer: Used to talk with database, all transaction related logic is here!

Advantage of Spring on top of Hibernate: We don't need to write the Transactional operations explicitly,
Spring takes care of it implicitly.

Model Layer: It represents the classes, corresponding to which tables are created in the database.

Service Layer: It acts as an abstraction layer for outside world. They talk to it for transaction, service layer then contact to DAO layer for actual work.


ApplicationContext.xml file  in src/main/resources: Contains all the hibernate configuration properties which helps in ORM to work properly
and transactiona Manager,component scan related properties are also set over here.
 

 
 
A simple example of Junit testing of the AOP concept is also covered,

1. com/app/spring/Item, com/app/spring/Order classes are used.
2. com/app/spring/HibernateConfiguration.java is used for getting the application context instead
   of application.context.xml file
   
   
   
   
Spring MVC:

JSP page -> Controller Class -> Service Class -> Repository -> Component/Entity

src/main/webapp/WEB-INF/ contains the .jsp pages and mvc-config.xml,web.xml file which is the core of MVC implementation.

