package com.stevencat.designpatterntalks.strategy;

public class Main {

    public static void main(String[] args) {
        double money = 500;
        System.out.println("total prize: " + money);

        // 无优惠
        CashContext normalContext = new CashContext("normal");
        System.out.println("normal: " + normalContext.getResult(money));

        // 满150减30
        CashContext returnContext = new CashContext("return");
        System.out.println("return: " + returnContext.getResult(money));

        // 打6折
        CashContext rebateContext = new CashContext("rebate");
        System.out.println("rebate: " + rebateContext.getResult(money));

    }

}
