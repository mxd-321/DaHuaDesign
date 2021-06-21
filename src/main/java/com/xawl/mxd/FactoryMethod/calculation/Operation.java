package com.xawl.mxd.FactoryMethod.calculation;

/**
 * @Author mxd
 * @Date 2021/6/16 8:45
 * 运算类
 */

public abstract class Operation {
    private double numberA;
    private double numberB;

    public void setNumberA(double numberA) {
        this.numberA = numberA;
    }

    public void setNumberB(double numberB) {
        this.numberB = numberB;
    }

    public double getNumberA() {
        return numberA;
    }

    public double getNumberB() {
        return numberB;
    }

    /**
     * 运算类中计算结果的方法
     * @return
     */
    public abstract double getResult();
}
