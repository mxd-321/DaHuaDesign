package com.xawl.mxd.ObserverMode;

import com.xawl.mxd.ObserverMode.observer.Student;
import com.xawl.mxd.ObserverMode.subject.ClassSubjectOne;

/**
 * @Author mxd
 * @Date 2021/6/22 21:04
 *  观察者模式：又称为发布-订阅模式，属于行为型模式的一种，它定义了一种一对多的依赖关系，让多个观察者对象同时监听某一个主题对象。
 *          这个主题对象在状态变化时，会通知所有的观察者对象，使他们能够自动更新自己。
 *
 *   在jdk中有 Observer 接口，他的通知者是 Observable，Observable类中定义了添加、删除、通知观察者的方法。
 *
 */

public class Test {
    public static void main(String[] args) {
        // 班级1，通知消息
        ClassSubjectOne classSubjectOne = new ClassSubjectOne();

        // 创建同学
        Student student1 = new Student("小孟");
        Student student2= new Student("小小孟");
        Student student3 = new Student("小刘");

        // 订阅班级1
        classSubjectOne.attach(student1);
        classSubjectOne.attach(student2);
        classSubjectOne.attach(student3);

        // 班级1 给同学们发通知了
        classSubjectOne.notify("大家好，欢迎来到ClassOne");
    }
}
