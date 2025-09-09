package com.github.alexander.spring.framework.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

class Student{
    private Address address;

    public Student(Address address){
        this.address = address;
    }

    public void print(){
        System.out.println("Student class method called ...");
        address.print();
    }

    public void init(){
        System.out.println("Initialization logic");
    }

    public void destroy(){
        System.out.println("Destruction logic");
    }
}

class Address{
    public void print(){
        System.out.println("Address class method called ...");
    }
}

@Configuration
class AppConfig{

    /// @Bean is annotation that he method creates, configures, and initializes an object
    /// that will be managed by the Spring IoC (Inversion of Control) container.

    @Bean(name = "addressBean")
    public Address address(){
        return new Address();
    }

    @Bean(name = "studentBean", initMethod = "init", destroyMethod = "destroy")
    public Student student(){
        return new Student(address());
    }
}

public class BeanAnnotation {
    public static void main(String[] args) {

        try(var applicationContext = new AnnotationConfigApplicationContext(AppConfig.class)){
            Student student = applicationContext.getBean(Student.class);
            student.print();

            System.out.println("Beans:");

            String[] beanNames = applicationContext.getBeanDefinitionNames();
            for(String bean : beanNames){
                System.out.println(bean);
            }
        }

    }
}
