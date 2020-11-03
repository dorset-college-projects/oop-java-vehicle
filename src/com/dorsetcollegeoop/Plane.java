package com.dorsetcollegeoop;

public class Plane extends Vehicle {

    public Plane() {

        MessageCentre.DebugMessage("Creating a plane");
    }

    @Override
    public String toString() {

        return String.format("plane");
    }

}
