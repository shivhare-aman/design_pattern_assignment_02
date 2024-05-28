package com.designPattern.E.Commerce.strategy;

public class StandardShipping implements ShippingMethod {
    @Override
    public double calculate(double weight) {
        return weight;
    }
}
