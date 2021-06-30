package com.xawl.mxd.IteratorMode.aggregate;

import com.xawl.mxd.IteratorMode.iterator.ConcreteIterator;
import com.xawl.mxd.IteratorMode.iterator.Iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author mxd
 * @Date 2021/6/30 21:57
 *   具体的聚合类，实现Aggregate接口。类似于ArrayList类
 */

public class ConcreteAggregate<T> implements Aggregate<T> {

    private final List<T> list = new ArrayList<>();

    @Override
    public Iterator<T> createIterator() {
        return new ConcreteIterator<>(list);
    }

    @Override
    public void add(T t) {
        list.add(t);
    }

    @Override
    public void remove(T t) {
        list.remove(t);
    }

    /**
     * 返回聚集总数
     * @return
     */
    public int count(){
        return list.size();
    }
}
