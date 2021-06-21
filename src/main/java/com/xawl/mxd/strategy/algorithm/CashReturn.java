package com.xawl.mxd.strategy.algorithm;

/**
 * @Author mxd
 * @Date 2021/4/26 10:54
 *  返利收费算法
 */

public class CashReturn extends CashSuper{

    private final double moneySum;
    private final double moneyReturn;

    public CashReturn(double moneySum, double moneyReturn) {
        this.moneySum = moneySum;
        this.moneyReturn = moneyReturn;
    }

    @Override
    public double acceptCash(double money) {
        double result = money;

        if(money >= moneySum){
            result = money - (int)(money/moneySum) * moneyReturn;
        }

        return result;
    }
}
