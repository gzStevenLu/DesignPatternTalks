package com.stevencat.designpatterntalks.proxy;

public class Wallet implements Payment {

    private double balance;

    public Wallet(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public boolean pay(double money) {
        if (money > balance) {
            return false;
        }
        balance -= money;
        return true;
    }
}
