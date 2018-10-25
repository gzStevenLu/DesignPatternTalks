package com.stevencat.designpatterntalks.proxy;

public interface Payment {

    /**
     * 支付行为
     * @param money
     */
    boolean pay(double money);

}
