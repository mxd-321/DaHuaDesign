package com.xawl.mxd.ObserverMode.subject;

import com.xawl.mxd.ObserverMode.observer.Observer;

/**
 * @Author mxd
 * @Date 2021/6/22 21:11
 *
 *  抽象观察者/主题：提供了增加、删除、 通知观察者的方法
 */

public interface Subject {

    /**
     * 添加观察者
     * @param observer
     */
    public void attach(Observer observer);

    /**
     * 删除观察者
     * @param observer
     */
    public void detach(Observer observer);

    /**
     * 通知观察者
     * @param message  通知具体的消息
     */
    public void notify(String message);
}
