package com.xawl.mxd.buildermode.builder;

import com.xawl.mxd.buildermode.Product;

/**
 * @Author mxd
 * @Date 2021/6/21 20:38
 *   抽象建造者类，已经确定产品由两个部件PartA和PartB组成，并且声明一个得到产品建造后的方法
 */

public abstract class Builder {
    /**
     * 产品需要的部件A
     */
    public abstract void builderPartA();

    /**
     * 产品需要的部件B
     */
    public abstract void builderPartB();

    /**
     * 返回产品
     * @return
     */
    public abstract Product getResult();
}
