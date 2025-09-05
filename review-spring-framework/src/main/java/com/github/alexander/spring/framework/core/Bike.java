package com.github.alexander.spring.framework.core;

import org.springframework.stereotype.Component;

/// @Component is annotation to allow spring container to automatically detect the component

@Component("bike")
public class Bike implements Vehicle {

    @Override
    public void move(){
        System.out.println("Bike is moving ...");
    }
}
