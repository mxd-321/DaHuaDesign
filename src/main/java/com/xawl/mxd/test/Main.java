package com.xawl.mxd.test;

/**
 * @Author mxd
 * @Date 2021/5/27 16:38
 */

public class Main {
    static Object object1= new Object();
    static Object object2 = new Object();

    public static void main(String[] args) {
        new Thread(()->{
            synchronized (object1){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (object2){

                }
            }
        }).start();

        new Thread(()->{
            synchronized (object2){
                synchronized (object1){

                }
            }
        }).start();

    }
}
