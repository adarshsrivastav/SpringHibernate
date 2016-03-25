# SpringHibernate
Basic Spring Transactions used!


Springs gives us extra features like @Repositiory,@Service,@Autowired,@Bean,@Transactional

Basic Spring + Hibernate ORM concepts used for storing the objects into table!

Whole project is divided into Spring,DAO,Model and Service.

Spring module: Used to set the application context and get bean.

DAO Layer: Used to talk with database, all transaction related logic is here!

Advantage of Spring on top of Hibernate: We don't need to write the Transactional operations explicitly,
Spring takes care of it implicitly.

Model Layer: It represents the classes, corresponding to which tables are created in the database.

Service Layer: It acts as an abstraction layer for outside world. They talk to it for transaction, service layer then contact to DAO layer for actual work.


ApplicationContext.xml file  in src/main/resources: Contains all the hibernate configuration properties which helps in ORM to work properly
and transactiona Manager,component scan related properties are also set over here.
 

 
 
A simple example of Junit testing is also covered,

1. com/app/spring/Item, com/app/spring/Order classes are used.
2. com/app/spring/HibernateConfiguration.java is used for getting the application context instead
   of application.context.xml file