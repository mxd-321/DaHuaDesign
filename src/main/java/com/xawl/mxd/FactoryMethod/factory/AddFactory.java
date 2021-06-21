package com.xawl.mxd.FactoryMethod.factory;

import com.xawl.mxd.FactoryMethod.calculation.Operation;
import com.xawl.mxd.FactoryMethod.calculation.OperationAdd;

/**
 * @Author mxd
 * @Date 2021/6/16 8:52
 * 加法工厂类
 */

public class AddFactory implements IFactory{
    @Override
    public Operation createOperation() {
        return new OperationAdd();
    }
}
