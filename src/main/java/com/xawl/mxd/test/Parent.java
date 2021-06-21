package com.xawl.mxd.test;

/**
 * @Author mxd
 * @Date 2021/5/27 16:36
 */

public class Parent {
    static {
        System.out.println("parent static");
    }

    public Parent(){
        System.out.println("parent 构造");
    }

    {
        System.out.println("parent no static");
    }

}
