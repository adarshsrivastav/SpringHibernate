# Spring MVCandREST
Basic Spring MVC and REST concept used!

A basic web application where user can signup and login!
A REST API is created.


Springs gives us extra features like @Controller,@Repositiory,@Service,@Autowired,@Bean,@Transactional

Basic Spring MVC + REST + Hibernate ORM concepts used for storing the objects into table!

Whole project is divided into Client,Model,Repository,Resource,Service.

Client module: It contains the Rest Client which handles the user request and take appropriate actions.

Model Layer: It represents the classes, corresponding to which tables are created in the database.

Repositoy Layer: JPA repository example as our database is already created using our previous example .

Resource Layer: Response related to user request are generated over here in the pre-determined format.

Service Layer: It acts as an abstraction layer for outside world. They talk to it for transaction, service layer then contact to DAO layer for actual work.


ApplicationContext.xml file  in src/main/resources: Contains all the hibernate configuration properties which helps in ORM to work properly
and transactiona Manager,component scan related properties are also set over here.
 

 
 
A simple example of Junit testing of the AOP concept is also covered,

1. com/app/spring/Item, com/app/spring/Order classes are used.
2. com/app/spring/HibernateConfiguration.java is used for getting the application context instead
   of application.context.xml file
   
   
   
   
Spring MVC:

JSP page -> Controller Class -> Service Class -> Repository -> Component/Entity

src/main/webapp contains the .jsp pages and servlet-context.xml,web.xml file which is the core of MVC implementation.



Spring + REST :

@POST,@GET,@Path,@Produces,@Consumes,@XmlRootElement are some of the annotations used.