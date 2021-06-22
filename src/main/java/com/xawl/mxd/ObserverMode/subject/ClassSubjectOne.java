package com.xawl.mxd.ObserverMode.subject;

import com.xawl.mxd.ObserverMode.observer.Observer;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author mxd
 * @Date 2021/6/22 21:14
 * 具体的通知者/主题 ，可以有不同的，他们都继承抽象通知者/主题
 */

public class ClassSubjectOne implements Subject {

    /**
     * 自己的存储观察者的集合,这里用了set，因为考虑到重复订阅问题
     */
    private final Set<Observer> observers = new HashSet<>();

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notify(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }
}
