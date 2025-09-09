package com.github.alexander.spring.framework.assignment.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.github.alexander.spring.framework.assignment")
public class AppConfig {

    /// We can define all the settings for this application on AppConfig.class.
    @Bean
    public DataSource myDataSource(){
        return new MySQLDataSource();
    }

    @Bean
    public DataSource postgreSQLDataSource(){
        return new PostgreSQLDataSource();
    }

    @Bean
    public EmailService emailService(){
        return new EmailService(postgreSQLDataSource());
    }
}
