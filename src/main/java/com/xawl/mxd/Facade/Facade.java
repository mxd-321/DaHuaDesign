package com.xawl.mxd.Facade;

import com.xawl.mxd.Facade.subsystem.SubSystemFour;
import com.xawl.mxd.Facade.subsystem.SubSystemOne;
import com.xawl.mxd.Facade.subsystem.SubSystemThree;
import com.xawl.mxd.Facade.subsystem.SubSystemTow;

/**
 * @Author mxd
 * @Date 2021/6/19 19:35
 *  外观类： 它需要了解所有的子系统的方法或属性，进行组合，以备外界调用
 */

public class Facade {
    SubSystemOne one;
    SubSystemTow tow;
    SubSystemThree three;
    SubSystemFour four;

    public Facade() {
        this.one = new SubSystemOne();
        this.tow = new SubSystemTow();
        this.three = new SubSystemThree();
        this.four = new SubSystemFour();
    }

    public void methodA() {
        System.out.println("方法组 methodA()");
        one.methodOne();
        tow.methodTwo();;
        four.methodFour();
    }

    public void methodB() {
        System.out.println("方法组 methodB()");
        tow.methodTwo();
        three.methodThree();
    }
}
