package com.xawl.mxd.TemplateMethod;

/**
 * @Author mxd
 * @Date 2021/6/17 23:42
 */

public abstract class AbstractClass {
    /**
     * 模板方法1
     */
    public abstract void primitiveOperation1();

    /**
     * 模板方法2
     */
    public abstract void primitiveOperation2();

    public void show(){
        primitiveOperation1();
        primitiveOperation2();
        System.out.println();
    }
}
