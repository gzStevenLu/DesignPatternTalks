package com.stevencat.designpatterntalks.builder;

public class ConcreteBuilder implements Builder {

    private Product product = new Product();

    @Override
    public void buildPartA() {
        product.setPartA("AA");
    }

    @Override
    public void buildPartB() {
        product.setPartB(1234567890);
    }

    @Override
    public void buildPartC() {
        product.setPartC(10.24);
    }

    @Override
    public Product getResult() {
        return product;
    }
}
