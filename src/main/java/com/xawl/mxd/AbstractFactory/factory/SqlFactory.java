package com.xawl.mxd.AbstractFactory.factory;

import com.xawl.mxd.AbstractFactory.operation.IUser;

/**
 * @Author mxd
 * @Date 2021/6/24 20:46
 *  定义工厂接口，用于生产User表的对象
 */

public interface SqlFactory {
    /**
     *  用于访问 User 表的对象
     * @return
     */
    public IUser createUser();
}
