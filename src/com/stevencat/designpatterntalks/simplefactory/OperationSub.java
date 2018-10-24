package com.stevencat.designpatterntalks.simplefactory;

public class OperationSub extends Operation {

    @Override
    public double getResult() {
        return a - b;
    }
}
