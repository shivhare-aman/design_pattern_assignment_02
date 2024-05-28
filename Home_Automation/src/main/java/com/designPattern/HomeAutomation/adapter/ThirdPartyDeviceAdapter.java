package com.designPattern.HomeAutomation.adapter;

public class ThirdPartyDeviceAdapter implements DeviceAdapter {
    private ThirdPartyDevice thirdPartyDevice;

    public ThirdPartyDeviceAdapter(ThirdPartyDevice device) {
        this.thirdPartyDevice = device;
    }

    public void turnDeviceOn() {
        thirdPartyDevice.start();
    }

    public void turnDeviceOff() {
        thirdPartyDevice.stop();
    }
}
