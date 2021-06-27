package com.xawl.mxd.AdapterMode;

/**
 * @Author mxd
 * @Date 2021/6/27 20:17
 *  需要适配的接口，和我们所需要的接口名字不一样，或者类型不同
 */

public class Adaptee {
    public void specificRequest() {
        System.out.println("特殊请求!");
    }
}
