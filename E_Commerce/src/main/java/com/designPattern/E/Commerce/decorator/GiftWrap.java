package com.designPattern.E.Commerce.decorator;

public class GiftWrap extends ProductDecorator {
    public GiftWrap(Product decoratedProduct) {
        super(decoratedProduct);
    }

    @Override
    public String getName() {
        return decoratedProduct.getName() + ", Gift Wrapped";
    }

    @Override
    public double getPrice() {
        return decoratedProduct.getPrice() + 5.00;
    }
}
