package com.xawl.mxd.Facade;

/**
 * @Author mxd
 * @Date 2021/6/19 19:40
 * 外观模式：为子系统中的一组接口提供一个一致的界面，此模式定义了一个高层接口，
 *          这个接口使得这一子系统更加容易使用。
 * 作用：在维护老旧系统的时候，可以先开发一个 facade 外观，来和老系统进行交互。
 *          这个 facade类提供老旧系统的接口
 */

public class Main {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.methodA();
    }
}
