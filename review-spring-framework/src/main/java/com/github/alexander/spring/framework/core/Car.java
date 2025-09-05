package com.github.alexander.spring.framework.core;

import org.springframework.stereotype.Component;

/// @Component is annotation to allow spring container to automatically detect the component
/// @Primary is annotation to give higher preference to a bean when there are multiple beans of the same type.

@Component("car")
public class Car implements Vehicle {

    @Override
    public void move(){
        System.out.println("Car is moving ...");
    }
}
