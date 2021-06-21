package com.xawl.mxd.strategy.algorithm;

/**
 * @Author mxd
 * @Date 2021/4/26 10:51
 *  正常收取现金算法
 */

public class CashNormal extends CashSuper{
    @Override
    public double acceptCash(double money) {
        return money;
    }
}
