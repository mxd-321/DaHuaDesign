package com.xawl.mxd.SingletonMode;

/**
 * @Author mxd
 * @Date 2021/7/1 19:32
 *  静态内部类：当这个类初始化时，不会初始化静态内部类，直到外部调用时，才会初始化静态内部类
 */

public class Singleton3 {
    private Singleton3() {}

    public static class Inner {
        private static final Singleton3 INSTANCE = new Singleton3();
    }

    public static Singleton3 getInstance() {
        return Inner.INSTANCE;
    }
}
