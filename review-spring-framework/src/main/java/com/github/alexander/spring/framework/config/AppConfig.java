package com.github.alexander.spring.framework.config;

import com.github.alexander.spring.framework.core.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/// @Configuration to configure one or more Spring beans with @Bean annotation
@Configuration
public class AppConfig {

    @Bean
    public Vehicle car(){
        return new Car();
    }

    @Bean
    public Vehicle bike(){
        return new Bike();
    }

    @Bean
    public Vehicle cycle(){
        return new Cycle();
    }

    @Bean
    public Traveler traveler(){
        /// Dependency Injection
        return new Traveler(cycle());
    }
}
