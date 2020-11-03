package com.dorsetcollegeoop;

public class TestRunner {

    public void Run() {

        // Vehicle v1 = new Vehicle(); // abstract, cannot be instantiated


        Car c1 = new Car();

        Car c2 = new Car("Nissan", "Navara");

        MessageCentre.DebugMessage(c2.toString());

        Bicycle b1 = new Bicycle();

        System.out.println(b1.toString());

        MotorCycle m1 = new MotorCycle();

        RowingBoat rb1 = new RowingBoat();

        Plane plane1 = new Plane();


    }
}
