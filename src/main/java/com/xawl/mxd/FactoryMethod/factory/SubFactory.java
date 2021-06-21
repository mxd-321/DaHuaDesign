package com.xawl.mxd.FactoryMethod.factory;

import com.xawl.mxd.FactoryMethod.calculation.Operation;
import com.xawl.mxd.FactoryMethod.calculation.OperationSub;

/**
 * @Author mxd
 * @Date 2021/6/16 8:55
 * 减法工厂类
 */

public class SubFactory implements IFactory{
    @Override
    public Operation createOperation() {
        return new OperationSub();
    }
}
