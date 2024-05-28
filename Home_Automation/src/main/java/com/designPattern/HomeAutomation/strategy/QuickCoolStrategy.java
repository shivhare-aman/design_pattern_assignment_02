package com.designPattern.HomeAutomation.strategy;

public class QuickCoolStrategy implements TemperatureControl {

    public void regulate() {
        System.out.println("Regulating temperature using quick cool strategy.");
    }
}
