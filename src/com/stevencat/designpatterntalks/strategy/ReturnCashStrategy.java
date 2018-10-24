package com.stevencat.designpatterntalks.strategy;

public class ReturnCashStrategy implements CashStrategy {

    private double limitMoney;
    private double returnMoney;

    public ReturnCashStrategy(double limitMoney, double returnMoney) {
        this.limitMoney = limitMoney;
        this.returnMoney = returnMoney;
    }

    @Override
    public double getResult(double total) {
        return total - (int)(total / limitMoney) * returnMoney;
    }

}
