package com.xawl.mxd.ObserverMode.observer;

/**
 * @Author mxd
 * @Date 2021/6/22 21:09
 *  具体的观察者，可以有不同的观察者，他们都继承抽象观察者。
 */

public class Student implements Observer{

    private String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println("学生:" + name + ",得到了通知,内容：" + message);
    }
}
