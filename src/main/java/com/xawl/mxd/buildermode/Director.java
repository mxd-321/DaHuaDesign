package com.xawl.mxd.buildermode;


import com.xawl.mxd.buildermode.builder.Builder;

/**
 * @Author mxd
 * @Date 2021/6/21 20:43
 *  指挥者类，用于用户和构建者之间，用户不需要知道怎么构建，只需要告诉指挥者构建什么类即可
 */

public class Director {

    public void construct(Builder builder) {
        builder.builderPartA();
        builder.builderPartB();
    }
}
