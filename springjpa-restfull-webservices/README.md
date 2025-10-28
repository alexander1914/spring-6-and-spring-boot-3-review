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


# Database Oracle on Docker 

*Create new user*

*Create database*

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

