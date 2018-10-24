package com.stevencat.designpatterntalks.strategy;

/**
 * 收费上下文
 */
public class CashContext {

    private CashStrategy strategy;

    public CashContext(String type) {
        // 选择相应的策略
        switch (type) {
            case "normal":
                // 无优惠
                strategy = new NormalCashStrategy();
                break;
            case "return":
                // 满150减30
                strategy = new ReturnCashStrategy(150, 30);
                break;
            case "rebate":
                // 打6折
                strategy = new RebateCashStrategy(0.6);
                break;
            default:
        }
    }

    /**
     * 实收
     * @param money
     * @return
     */
    public double getResult(double money) {
        // 面向接口
        return strategy.getResult(money);
    }

}
