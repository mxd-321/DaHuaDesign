package com.xawl.mxd.IteratorMode.iterator;

/**
 * @author Lenovo
 *  迭代器接口
 */
public interface Iterator<T> {

    /**
     * 得到第一个对象
     * @return
     */
    public T first();

    /**
     * 得到下一个对象
     * @return
     */
    public T next();

    /**
     * 判断是否有下一个元素
     * @return
     */
    public boolean hasNext();

}
