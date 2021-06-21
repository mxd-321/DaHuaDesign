package com.xawl.mxd.FactoryMethod;

import com.xawl.mxd.FactoryMethod.calculation.Operation;
import com.xawl.mxd.FactoryMethod.factory.AddFactory;
import com.xawl.mxd.FactoryMethod.factory.IFactory;

/**
 * @Author mxd
 * @Date 2021/6/16 8:56
 * 工厂方法模式：定义一个用于创建对象的接口，让子类决定实例化哪一个类。
 * 工厂方法使一个类的实例化延迟到它的子类，好处：解耦合，对修改关闭，对增加开放
 */

public class Test {
    public static void main(String[] args) {
        IFactory factory = new AddFactory();
        Operation operation = factory.createOperation();

        operation.setNumberA(1);
        operation.setNumberB(2);
        double result = operation.getResult();
        System.out.println(result);
    }
}
