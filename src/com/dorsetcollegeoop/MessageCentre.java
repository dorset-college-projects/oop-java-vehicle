package com.dorsetcollegeoop;

public  class MessageCentre {

    static boolean showMessage = true;

    public static void DebugMessage(String message) {

        if (showMessage) { System.out.println(message); }
    }
}
