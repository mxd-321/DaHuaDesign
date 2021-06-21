package com.xawl.mxd.SimpleFactory.calculation;

/**
 * @Author mxd
 * @Date 2021/4/25 12:27
 *
 *   运算类
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

    public abstract double getResult();
}
