package com.xawl.mxd.AdapterMode;

/**
 * @Author mxd
 * @Date 2021/6/27 20:19
 *  适配器，通过在内部包装一个 Adaptee对象，把源接口转换成目标接口
 *    这个是对象适配器，是将 Adaptee 作为一个成员属性
 */

public class Adapter extends Adaptee implements Target{
    private final Adaptee adaptee = new Adaptee();

    @Override
    public void request() {
        // 这样就可以把表面上调用 request() 方法变成实际调用 specificRequest()
        adaptee.specificRequest();
    }
}
