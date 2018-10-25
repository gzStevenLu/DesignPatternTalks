package com.stevencat.designpatterntalks.proxy;

public class Main {

    public static void main(String[] args) {
        WalletProxy proxy = new WalletProxy(new Wallet(500));
        proxy.pay(230);
    }

}
