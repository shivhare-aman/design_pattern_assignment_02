package com.designPattern.HomeAutomation.decorator;

public class PowerSavingMode extends DeviceDecorator {

    public PowerSavingMode(SmartDevice device) {
        super(device);
    }

    public void switchOn() {
        decoratedDevice.switchOn();
        System.out.println(decoratedDevice.name + " is now in power-saving mode.");
    }
}
