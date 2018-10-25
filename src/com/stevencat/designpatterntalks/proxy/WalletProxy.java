package com.stevencat.designpatterntalks.proxy;

public class WalletProxy implements Payment {

    private Wallet wallet;

    public WalletProxy(Wallet wallet) {
        this.wallet = wallet;
    }

    /**
     * 代理方法
     *
     * @param money
     * @return
     */
    @Override
    public boolean pay(double money) {
        beforePay(money);
        boolean result = wallet.pay(money);
        afterPay(result);
        return result;
    }

    private void beforePay(double money) {
        System.out.println("=== Trade start ===");
        System.out.println("before pay balance: " + wallet.getBalance());
        System.out.println("pay for money: " + money);
    }

    private void afterPay(boolean result) {
        System.out.println("transaction result: " + result);
        System.out.println("before pay balance: " + wallet.getBalance());
        System.out.println("=== Trade finish ===");
    }
}
