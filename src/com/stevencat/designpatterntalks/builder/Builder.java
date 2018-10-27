package com.stevencat.designpatterntalks.builder;

public interface Builder {

    void buildPartA();

    void buildPartB();

    void buildPartC();

    Product getResult();

}
