package com.xawl.mxd.strategy.algorithm;

/**
 * @Author mxd
 * @Date 2021/4/26 10:52
 *  打折收取现金的算法
 */

public class CashRebate extends CashSuper {

    private final double rebate;

    public CashRebate(double rebate){
        this.rebate = rebate;
    }

    @Override
    public double acceptCash(double money) {
        return money * rebate;
    }
}
