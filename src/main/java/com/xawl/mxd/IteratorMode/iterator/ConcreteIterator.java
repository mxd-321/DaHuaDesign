package com.xawl.mxd.IteratorMode.iterator;

import java.util.List;

/**
 * @Author mxd
 * @Date 2021/6/30 21:47
 *   具体的迭代器，实现Iterator方法
 */

public class ConcreteIterator<T> implements Iterator<T>{

    private final List<T> list;
    private int current = 0;

    public ConcreteIterator(List<T> list){
        this.list = list;
    }
    @Override
    public T first() {
        return list.get(0);
    }

    @Override
    public T next() {
        T res = null;
        if (hasNext()){
            res = list.get(current++);
        }

        return res;
    }

    @Override
    public boolean hasNext() {
        if (current == list.size()){
            return false;
        }
        return true;
    }
}
