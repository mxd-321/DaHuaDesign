package com.xawl.mxd.TemplateMethod;

/**
 * @Author mxd
 * @Date 2021/6/17 23:58
 * 模板方法模式：当不变的和可变的行为在方法的子类实现混合在一起的时候，不变的行为就会在子类中重复出现。
 * 我们通过模板方法模式把这些行为搬移到单一的地方，这样就帮助子类摆脱重复的不变行为的纠缠
 */

public class Test {
    public static void main(String[] args) {
        AbstractClass a = new ConcreteClassA();
        a.show();

        AbstractClass b = new ConcreteClassB();
        b.show();
    }
}
