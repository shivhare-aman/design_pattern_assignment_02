package com.designPattern.HomeAutomation.decorator;

public abstract class DeviceDecorator extends SmartDevice {
    protected SmartDevice decoratedDevice;

    public DeviceDecorator(SmartDevice device) {
        super(device.name);
        this.decoratedDevice = device;
    }

    public void switchOn() {
        decoratedDevice.switchOn();
    }

    public void switchOff() {
        decoratedDevice.switchOff();
    }
}

