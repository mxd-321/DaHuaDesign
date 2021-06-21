package com.xawl.mxd.buildermode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author mxd
 * @Date 2021/6/21 20:34
 *  产品类：由多个部件组成.
 */

public class Product {
    private final List<String> parts = new ArrayList<>();

    public void add(String part) {
        parts.add(part);
    }

    public void show() {

        System.out.print("产品 创建---");
        for (String part : parts) {
            System.out.print(part + " ");
        }
    }
}
