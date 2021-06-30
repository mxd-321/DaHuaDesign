package com.xawl.mxd.IteratorMode.aggregate;

import com.xawl.mxd.IteratorMode.iterator.Iterator;

/**
 * @Author mxd
 * @Date 2021/6/30 21:55
 *  聚合接口   类似于List接口
 */

public interface Aggregate<T> {
    /**
     * 创建迭代器
     * @return
     */
    public Iterator<T> createIterator();

    /**
     * 添加元素
     * @param t
     */
    public void add(T t);

    /**
     * 删除元素
     * @param t
     */
    public void remove(T t);
}
