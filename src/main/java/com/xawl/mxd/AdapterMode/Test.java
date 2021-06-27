package com.xawl.mxd.AdapterMode;

/**
 * @Author mxd
 * @Date 2021/6/27 19:53
 * 适配器模式：将一个类的接口转换成客户希望的另外一个接口。
 *      Adapter 模式是的原本由于接口不兼容而不能一起工作的那些类可以一起工作
 *   系统的数据和行为都正确，但接口不符时，我们应该考虑用适配器，目的是使控制范围之外的一个原有对象与某个接口匹配
 *   适配器模式主要应用于希望复用一些现存的类，但是接口又与复用环境要求不一致的情况
 *
 *   当我们调用第三方组件的时候，这个组件的接口和我们系统的接口不同时，可以考虑使用适配器模式
 */

public class Test {
    public static void main(String[] args) {
        // 客户端代码
        Target target = new Adapter();
//        Target target = new Adapter2();

        // 对于客户端来说，调用的就是 Target 的 request() 方法
        target.request();
    }
}
