package com.xawl.mxd.SimpleFactory;

import com.xawl.mxd.SimpleFactory.calculation.Operation;
import com.xawl.mxd.SimpleFactory.factory.OperationFactory;

/**
 * @Author mxd
 * @Date 2021/4/25 12:37
 * 简单工厂模式
 * 缺点：把创建实例耦合在一起，如果需要添加功能，需要修改工厂类，违背了 开放-封闭原则
 */

public class Test {
    public static void main(String[] args) {
        Operation operation = OperationFactory.createOperation("/");
        operation.setNumberA(12);
        operation.setNumberB(6);
        double result = operation.getResult();
        System.out.println(result);
    }
}
