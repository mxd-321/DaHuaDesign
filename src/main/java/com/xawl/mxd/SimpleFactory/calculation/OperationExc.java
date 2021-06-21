package com.xawl.mxd.SimpleFactory.calculation;

/**
 * @Author mxd
 * @Date 2021/4/25 16:09
 */

public class OperationExc extends Operation{
    @Override
    public double getResult() {
        if(getNumberB() == 0){
            throw new RuntimeException();
        }

        return getNumberA() / getNumberB();
    }
}
