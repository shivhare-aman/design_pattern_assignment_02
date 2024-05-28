package com.designPattern.E.Commerce.decorator;

public class Warranty extends ProductDecorator {
    public Warranty(Product decoratedProduct) {
        super(decoratedProduct);
    }

    @Override
    public String getName() {
        return decoratedProduct.getName() + ", Extended Warranty";
    }

    @Override
    public double getPrice() {
        return decoratedProduct.getPrice() + 20.00;
    }
}
