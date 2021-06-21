package com.xawl.mxd.FactoryMethod.factory;

import com.xawl.mxd.FactoryMethod.calculation.Operation;
import com.xawl.mxd.FactoryMethod.calculation.OperationMul;

/**
 * @Author mxd
 * @Date 2021/6/16 8:54
 * 乘法工厂类
 */

public class MulFactory implements IFactory{
    @Override
    public Operation createOperation() {
        return new OperationMul();
    }
}
