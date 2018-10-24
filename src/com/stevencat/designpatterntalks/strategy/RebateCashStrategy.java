package com.stevencat.designpatterntalks.strategy;

public class RebateCashStrategy implements CashStrategy {

    private double retate;

    public RebateCashStrategy(double retate) {
        this.retate = retate;
    }

    @Override
    public double getResult(double total) {
        return retate * total;
    }

}
