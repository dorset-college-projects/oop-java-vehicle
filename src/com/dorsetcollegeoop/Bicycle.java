package com.dorsetcollegeoop;

public class Bicycle extends Cycle {

    public Bicycle() {
        MessageCentre.DebugMessage("Creating a Bicycle");
    }

    @Override
    public String toString() {

        return "I am a bicycle";
    }

}
