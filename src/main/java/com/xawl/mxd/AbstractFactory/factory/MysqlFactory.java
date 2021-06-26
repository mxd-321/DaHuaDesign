package com.xawl.mxd.AbstractFactory.factory;

import com.xawl.mxd.AbstractFactory.operation.IUser;
import com.xawl.mxd.AbstractFactory.operation.MysqlUser;

/**
 * @Author mxd
 * @Date 2021/6/24 20:47
 */

public class MysqlFactory implements SqlFactory{
    @Override
    public IUser createUser() {
        return new MysqlUser();
    }
}
