package com.xawl.mxd.SingletonMode;

/**
 * @Author mxd
 * @Date 2021/7/1 19:28
 *  懒汉式单例模式，双端检锁机制
 */

public class Singleton2 {
    private static Singleton2 instance;
    private Singleton2() {}

    public static Singleton2 getInstance() {
        if (instance == null){
            synchronized (Singleton2.class){
                if (instance == null){
                    instance = new Singleton2();
                }
            }
        }

        return instance;
    }
}
