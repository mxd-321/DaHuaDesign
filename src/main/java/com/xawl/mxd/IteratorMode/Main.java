package com.xawl.mxd.IteratorMode;

import com.xawl.mxd.IteratorMode.aggregate.Aggregate;
import com.xawl.mxd.IteratorMode.aggregate.ConcreteAggregate;
import com.xawl.mxd.IteratorMode.iterator.Iterator;

import java.util.ArrayList;

/**
 * @Author mxd
 * @Date 2021/6/30 21:58
 *  迭代器模式
 */

public class Main {
    public static void main(String[] args) {
        Aggregate<String> aggregate = new ConcreteAggregate<>();
        aggregate.add("小红");
        aggregate.add("小明");
        aggregate.add("小兰");

        Iterator<String> iterator = aggregate.createIterator();

        while (iterator.hasNext()){
            String next = iterator.next();
            System.out.println(next);
        }
    }
}
