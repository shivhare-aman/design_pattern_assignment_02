package com.designPattern.HomeAutomation.decorator;

public class VacationMode extends DeviceDecorator {

    public VacationMode(SmartDevice device) {
        super(device);
    }

    public void switchOn() {
        decoratedDevice.switchOn();
        System.out.println(decoratedDevice.name + " is now in vacation mode.");
    }
}
