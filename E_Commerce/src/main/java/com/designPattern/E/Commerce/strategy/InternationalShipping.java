package com.designPattern.E.Commerce.strategy;

public class InternationalShipping implements ShippingMethod {
    @Override
    public double calculate(double weight) {
        return weight * 3.0;
    }
}
