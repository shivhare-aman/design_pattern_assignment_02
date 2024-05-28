package com.designPattern.HomeAutomation.decorator;

public class SmartDevice {
    protected String name;

    public SmartDevice(String name) {
        this.name = name;
    }

    public void switchOn() {
        System.out.println(name + " is now on.");
    }

    public void switchOff() {
        System.out.println(name + " is now off.");
    }
}
