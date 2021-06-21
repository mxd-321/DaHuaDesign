package com.xawl.mxd.test;

/**
 * @Author mxd
 * @Date 2021/5/27 16:36
 */

public class Son extends Parent{
    public static int SON_VALUE = 1;
    static {
        System.out.println("son static");
    }
    {
        System.out.println("son no static");
    }

    public Son(){
        System.out.println("son 构造");
    }

}
