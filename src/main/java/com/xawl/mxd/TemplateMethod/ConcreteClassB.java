package com.xawl.mxd.TemplateMethod;

/**
 * @Author mxd
 * @Date 2021/6/17 23:48
 */

public class ConcreteClassB extends AbstractClass{
    @Override
    public void primitiveOperation1() {
        System.out.println("具体类B 方法1的实现");
    }

    @Override
    public void primitiveOperation2() {
        System.out.println("具体类B 方法2的实现");
    }
}
