package com.dorsetcollegeoop;

public class RowingBoat extends Boat {

    public RowingBoat() {

        MessageCentre.DebugMessage("Creating a Rowing Boat");
    }


    @Override
    public String toString() {

        return String.format("rowing boat");
    }
}
