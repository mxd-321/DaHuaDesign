package com.xawl.mxd.SingletonMode;

/**
 * @Author mxd
 * @Date 2021/7/1 19:24
 *  单例模式
 */

public class Test {
    public static void main(String[] args) {
        // 饿汉式单例模式
        Singleton1 singleton1 = Singleton1.INSTANCE;

        // 懒汉式，双端检锁机制
        Singleton2 singleton2 = Singleton2.getInstance();

        // 静态内部类
    }
}
