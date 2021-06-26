package com.xawl.mxd.AbstractFactory.factory;

import com.xawl.mxd.AbstractFactory.operation.IUser;
import com.xawl.mxd.AbstractFactory.operation.OracleUser;


/**
 * @Author mxd
 * @Date 2021/6/24 20:48
 */

public class OracleFactory implements SqlFactory {
    @Override
    public IUser createUser() {
        return new OracleUser();
    }
}
