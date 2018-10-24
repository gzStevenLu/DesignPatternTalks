package com.stevencat.designpatterntalks.strategy;

/**
 * 计费策略
 */
public interface CashStrategy {

    /**
     * 结算收费算法
     * （金融场景使用BigDecimal更为可靠）
     *
     * @param total
     * @return
     */
    double getResult(double total);

}
