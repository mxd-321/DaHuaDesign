package com.xawl.mxd.strategy.algorithm;

/**
 * @Author mxd
 * @Date 2021/4/26 10:48
 *  策略模式  算法的父类
 */

public abstract class CashSuper {
    /**
     * 现金收取算法的抽象方法
     * @param money
     * @return
     */
    public abstract double acceptCash(double money);
}
