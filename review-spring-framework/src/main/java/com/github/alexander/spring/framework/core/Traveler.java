package com.github.alexander.spring.framework.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/// @Component is annotation to allow spring container to automatically detect the component.
@Component("traveler")

public class Traveler {

    /// Lousing Coupling
    private Vehicle vehicle;

    /// @Autowired is annotation tells Spring IoC container to automatically inject the dependency
    /// and to create an instance the object for us

    @Autowired
    public Traveler(@Qualifier("car") Vehicle vehicle){

        ///@Qualifier is annotation that we can eliminate the issue of which bean needs to be injected

        this.vehicle = vehicle;
    }

    public void startJourney(){
        this.vehicle.move();
    }
}
