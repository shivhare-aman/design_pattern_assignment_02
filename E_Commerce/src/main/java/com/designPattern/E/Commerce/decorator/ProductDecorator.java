package com.designPattern.E.Commerce.decorator;

public abstract class ProductDecorator extends Product {
    protected Product decoratedProduct;

    public ProductDecorator(Product decoratedProduct) {
        super(decoratedProduct.getName(), decoratedProduct.getPrice());
        this.decoratedProduct = decoratedProduct;
    }

    public abstract String getName();
    public abstract double getPrice();
}
