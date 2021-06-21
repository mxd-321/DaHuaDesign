package com.xawl.mxd.SimpleFactory.calculation;

/**
 * @Author mxd
 * @Date 2021/4/25 12:31
 *  加法类
 */

public class OperationAdd extends Operation{

    @Override
    public double getResult() {
        return getNumberA() + getNumberB();
    }
}
