package com.dorsetcollegeoop;

public class MotorCycle extends Cycle {

    public MotorCycle() {
        MessageCentre.DebugMessage("Creating a MotorCycle");
    }

    @Override
    public String toString() {

        return String.format("motorcycle");
    }

}
