package com.xawl.mxd.buildermode.builder;

import com.xawl.mxd.buildermode.Product;

/**
 * @Author mxd
 * @Date 2021/6/21 20:41
 *  具体的建造者2
 */

public class ConcreteBuilder2 extends Builder {

    private final Product product = new Product();

    @Override
    public void builderPartA() {
        product.add("部件X");
    }

    @Override
    public void builderPartB() {
        product.add("部件Y");
    }

    @Override
    public Product getResult() {
        return product;
    }
}
