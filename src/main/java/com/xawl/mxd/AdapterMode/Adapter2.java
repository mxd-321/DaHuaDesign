package com.xawl.mxd.AdapterMode;

/**
 * @Author mxd
 * @Date 2021/6/27 20:41
 *  类适配器，是继承需要适配的类，实现期待的接口。把源接口转换成目标接口
 */

public class Adapter2 extends Adaptee implements Target{
    @Override
    public void request() {
        // 这里调用父类的方法
        super.specificRequest();
    }
}
