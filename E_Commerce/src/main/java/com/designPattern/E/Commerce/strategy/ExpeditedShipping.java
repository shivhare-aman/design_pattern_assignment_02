package com.designPattern.E.Commerce.strategy;

public class ExpeditedShipping implements ShippingMethod {
    @Override
    public double calculate(double weight) {
        return weight * 1.5;
    }
}
