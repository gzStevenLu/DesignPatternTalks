package com.stevencat.designpatterntalks.simplefactory;

public class OperationMul extends Operation {

    @Override
    public double getResult() {
        return a * b;
    }
}
