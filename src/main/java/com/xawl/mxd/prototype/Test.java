package com.xawl.mxd.prototype;

/**
 * @Author mxd
 * @Date 2021/6/16 9:09
 *  原型模式：用原型实例指定创建对象的种类，并且通过拷贝这些原型创建新的对象
 *  优点：不用重新初始化对象，而是动态的获得对象运行时的状态
 */

public class Test {

    public static void main(String[] args) throws CloneNotSupportedException {
        Resume a = new Resume("孟翔丁");
        a.setPersonalInfo("男",21);
        a.setWorkExperience("2018-2022","西安文理学院");

        Resume b = (Resume) a.clone();
        b.setWorkExperience("2021-2022","海康威视");

        a.show();
        b.show();
    }

}
