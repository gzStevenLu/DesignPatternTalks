package com.stevencat.designpatterntalks.strategy;

public class NormalCashStrategy implements CashStrategy {

    @Override
    public double getResult(double total) {
        return total;
    }

}
