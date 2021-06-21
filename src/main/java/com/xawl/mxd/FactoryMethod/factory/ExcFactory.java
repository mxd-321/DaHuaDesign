package com.xawl.mxd.FactoryMethod.factory;

import com.xawl.mxd.FactoryMethod.calculation.Operation;
import com.xawl.mxd.FactoryMethod.calculation.OperationExc;

/**
 * @Author mxd
 * @Date 2021/6/16 8:53
 * 除法工厂类
 */

public class ExcFactory implements IFactory{
    @Override
    public Operation createOperation() {
        return new OperationExc();
    }
}
