package com.xawl.mxd.FactoryMethod.calculation;

/**
 * @Author mxd
 * @Date 2021/4/25 16:04
 */

public class OperationSub extends Operation {
    @Override
    public double getResult() {
        return getNumberA() - getNumberB();
    }
}
