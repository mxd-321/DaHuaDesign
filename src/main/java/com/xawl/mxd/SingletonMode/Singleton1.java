package com.xawl.mxd.SingletonMode;

/**
 * @Author mxd
 * @Date 2021/7/1 19:26
 *  饿汉式：
 *   在类初始化的时候，直接创建对象
 *     构造器私有化
 */

public class Singleton1 {
    public static final Singleton1 INSTANCE = new Singleton1();
    private Singleton1(){

    }
}
