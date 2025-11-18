# Spring JPA with RESTFull
At the moment, I'm reviewing more Spring Data JPA with RESFFull.

* **Spring Data JPA or JPA** stands for Java Persistence API, so before looking into that, 
* we must know about **ORM (Object Relation Mapping).** 
* So Object relation mapping is simply the process of persisting any java object directly into a database table.

# Getting Started
The following guides illustrate how to use some features concretely:

* [Spring Data JPA](https://www.geeksforgeeks.org/java/spring-boot-spring-data-jpa/)
* [Set Up Oracle DB for JPA](https://medium.com/@ishinihettiarachchiuv/how-to-connect-a-spring-boot-project-and-oracle-db-locally-and-create-tables-using-the-jpa-f0e1891ef470)
* [Spring Data JPA](https://docs.spring.io/spring-boot/3.5.6/reference/data/sql.html#data.sql.jpa-and-spring-data)
* [Accessing data with MySQL](https://spring.io/guides/gs/accessing-data-mysql/)
* [Accessing Data with JPA](https://spring.io/guides/gs/accessing-data-jpa/)
* [Oracle DB with Docker](https://medium.com/xp-inc/dica-r%C3%A1pida-criando-base-de-dados-oracle-vers%C3%A3o-21-3-0-no-docker-357b05754b84)
* [MapStruct](https://mapstruct.org/)
* [ModelMapper](https://modelmapper.org/getting-started/)


# Database Oracle on Docker 

*Create new user:* to create new user this container on docker

```
docker run --name oracle \
-d \
-p 51521:1521 \
-p 55500:5500 \
-e ORACLE_PWD=SUA_SENHA \
-e ORACLE_CHARACTERSET=AL32UTF8 \
oracle/database:21.3.0-xe

```

# Annotation JPA
**@Entity:** is an annotation that class can indicate that it is the entity,
and it can represent the tables in the relational database.

**@Id:** is an annotation that annotation in JPA marks a field as the primary key of an entity.
It uniquely identifies each row in the corresponding database table and is mandatory for every entity.

**@Table:** is an annotation that in JPA is used to define the database table mapping for an entity.

**@GeneratedValue:** is an annotation that defines how primary key values are automatically generated.

**@Column:** is an annotation that is used to define column-specific attributes for an entity field in the database.

# Annotation Lombok

**@Getter:** is an annotation that generates a getter method with access type as public which simply returns,
the field and with name getName() if the field name is "Name".

**@Setter:** is an annotation that generates a setter method with access type as public which returns void 
and takes a single parameter to assign the value to the field.

**@NoArgsConstructor:** is an annotation that generate a constructor with no arguments. 
It has an empty body and does nothing. 
It is generally used in combination with some other parameterized constructor in use. 
It is required when you want to generate an object of the class by passing no arguments in the constructor.

**@AllArgsConstructor:** is an annotation that generate a parameterized constructor which accepts, 
a single parameter for each field and initializes them using it. 
It is required when you want to generate an object of the class, 
by passing the initial values of the fields in the constructor. 

# DTO Data Transfer Object 
**Data Transfer Object (DTO)** is an object that carries data between processes. 
When you're working with a remote interface, each call is expensive as a result, you need to reduce the number of calls.

# Exception Handling
is a mechanism to handle runtime errors, allowing the normal flow of a program to continue. 
Exceptions are events that occur during program execution that disrupt the normal flow of instructions.

**@ResponseStatus:** is an annotation in Spring is the powerful tool used in the building RESTFull web services. 
It is allowed developers to control HTTP (Hypertext Transfer Protocol) status code returned by the application's, 
endpoints or when specific exceptions are thrown.

**ExceptionHandler:** is an annotation that helps deal with errors and exceptions present in APIs, 
delivering a robust enterprise application.

**@ControllerAdvice:** is an annotation that introduced in Spring 3.2 that enables global exception handling, 
across your entire Spring MVC application. 
It acts like Aspect-Oriented Programming (AOP), intercepting exceptions thrown by controllers.

# Validations Annotations
Validating user input is an important part of building secure and reliable applications. 
Spring Boot makes this simple by integrating with Hibernate Validator, 
the reference implementation of JSR 380 (Bean Validation API). 
Using it, developers can enforce validation rules on data models with simple annotations like 
@NotNull, @Size, @Email, etc.

**@NotEmpty:** is an annotation that a field is not null and also not empty, meaning
it must contain at least one element (for collections) or at least one character (for strings).

**@Email:** is annotation that Email can be validated with this.

**@Valid:** is annotation that triggers validation on the Employee object.

# Spring Actuator

is a subproject of Spring Boot. 
It adds several production grade services to your application with little effort on your part. 
In this guide, you will build an application and then see how to add these services.

**auditevents:**
Exposes audit events information for the current application. Requires an AuditEventRepository bean.

**beans:**
Displays a complete list of all the Spring beans in your application.

**caches:**
Exposes available caches.

**conditions:**
Shows the conditions that were evaluated on configuration and auto-configuration classes and the reasons why they did or did not match.

**configprops:**
Displays a collated list of all @ConfigurationProperties. Subject to sanitization.

**env:**
Exposes properties from Spring’s ConfigurableEnvironment. Subject to sanitization.

**flyway:**
Shows any Flyway database migrations that have been applied. Requires one or more Flyway beans.

**health:**
Shows application health information.

**httpexchanges:**
Displays HTTP exchange information (by default, the last 100 HTTP request-response exchanges). Requires an HttpExchangeRepository bean.

**info:**
Displays arbitrary application info.

**integrationgraph:**
Shows the Spring Integration graph. Requires a dependency on spring-integration-core.

**loggers:**
Shows and modifies the configuration of loggers in the application.

**liquibase:**
Shows any Liquibase database migrations that have been applied. Requires one or more Liquibase beans.

**metrics:**
Shows “metrics” information for the current application to diagnose the metrics the application has recorded.

**mappings:**
Displays a collated list of all @RequestMapping paths.

**quartz:**
Shows information about Quartz Scheduler jobs. Subject to sanitization.

**scheduledtasks:**
Displays the scheduled tasks in your application.

**sessions:**
Allows retrieval and deletion of user sessions from a Spring Session-backed session store. Requires a servlet-based web application that uses Spring Session.

**shutdown:**
Lets the application be gracefully shutdown. Only works when using jar packaging. Disabled by default.

**startup:**
Shows the startup steps data collected by the ApplicationStartup. Requires the SpringApplication to be configured with a BufferingApplicationStartup.

**threaddump:**
Performs a thread dump.
If your application is a web application (Spring MVC, Spring WebFlux, or Jersey), you can use the following additional endpoints:

**heapdump:**
Returns a heap dump file. On a HotSpot JVM, an HPROF-format file is returned. On an OpenJ9 JVM, a PHD-format file is returned.

**logfile:**
Returns the contents of the logfile (if the logging.file.name or the logging.file.path property has been set). Supports the use of the HTTP Range header to retrieve part of the log file’s content.

**prometheus:**
Exposes metrics in a format that can be scraped by a Prometheus server. Requires a dependency on micrometer-registry-prometheus.
