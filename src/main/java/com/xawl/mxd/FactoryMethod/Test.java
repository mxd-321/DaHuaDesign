package com.xawl.mxd.FactoryMethod;

import com.xawl.mxd.FactoryMethod.calculation.Operation;
import com.xawl.mxd.FactoryMethod.factory.IFactory;

/**
 * @Author mxd
 * @Date 2021/6/16 8:56
 * 工厂方法模式：工厂方法模式是对简单工厂模式进一步的解耦，因为在工厂方法模式中是一个子类对应一个工厂类，而这些工厂类都实现于一个抽象接口。
 *          这相当于是把原本会因为业务代码而庞大的简单工厂类，拆分成了一个个的工厂类，这样代码就不会都耦合在同一个类里了。
 */

public class Test {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        IFactory factory = (IFactory) Class.forName("com.xawl.mxd.FactoryMethod.factory.AddFactory").newInstance();
        Operation operation = factory.createOperation();

        operation.setNumberA(1);
        operation.setNumberB(2);
        double result = operation.getResult();
        System.out.println(result);
    }
}
