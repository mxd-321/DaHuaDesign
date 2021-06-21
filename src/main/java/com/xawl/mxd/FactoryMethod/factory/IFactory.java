package com.xawl.mxd.FactoryMethod.factory;

import com.xawl.mxd.FactoryMethod.calculation.Operation;

/**
 * @Author mxd
 * @Date 2021/6/16 8:49
 * 定义一个工厂接口
 */

public interface IFactory {
    /**
     * 创建对应的运算类
     * @return
     */
    public Operation createOperation();
}
