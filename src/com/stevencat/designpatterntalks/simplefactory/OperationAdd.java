package com.stevencat.designpatterntalks.simplefactory;

public class OperationAdd extends Operation {

    @Override
    public double getResult() {
        return a + b;
    }
}
