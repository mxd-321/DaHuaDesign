package com.xawl.mxd.buildermode;

import com.xawl.mxd.buildermode.builder.Builder;
import com.xawl.mxd.buildermode.builder.ConcreteBuilder1;
import com.xawl.mxd.buildermode.builder.ConcreteBuilder2;

/**
 * @Author mxd
 * @Date 2021/6/21 20:46
 *  构建者模式是在当创建复杂对象的算法应该独立于该对象的组成部分以及它的装配方式时适用的模式
 */

public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        Builder builder1 = new ConcreteBuilder1();
        Builder builder2 = new ConcreteBuilder2();

        // 构建builder1
        director.construct(builder1);
        Product product1 = builder1.getResult();
        product1.show();

        System.out.println();
        // 构建builder2
        director.construct(builder2);
        Product product2 = builder2.getResult();
        product2.show();
    }
}
