package com.designPattern.HomeAutomation.strategy;

public class EcoFriendlyStrategy implements TemperatureControl {

    public void regulate() {
        System.out.println("Regulating temperature using eco-friendly strategy.");
    }
}
