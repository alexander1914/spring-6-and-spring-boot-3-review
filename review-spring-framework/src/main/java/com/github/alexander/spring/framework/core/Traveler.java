package com.github.alexander.spring.framework.core;

public class Traveler {

    Car car = null;
    Bike bike;

    /// Lousing Coupling
    private Vehicle vehicle;

    public Traveler(Vehicle vehicle){
        /// Before
        /*
            this.car = new Car();
            this.bike = new Bike();
         */
        /// After
        this.vehicle = vehicle;
    }

    public void startJourney(){
        /// Before
        //this.car.move();
        //this.bike.move();

        /// After
        this.vehicle.move();
    }
}
