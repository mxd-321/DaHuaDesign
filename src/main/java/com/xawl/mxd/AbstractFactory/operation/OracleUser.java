package com.xawl.mxd.AbstractFactory.operation;

import com.xawl.mxd.AbstractFactory.entity.User;

/**
 * @Author mxd
 * @Date 2021/6/24 20:45
 */

public class OracleUser implements IUser{
    @Override
    public void insert(User user) {
        System.out.println("在oracle中的user表中插入一条元素");
    }

    @Override
    public User getUser(Integer id) {
        System.out.println("在oracle中的user表得到id为"+id+"的一条数据");
        return null;
    }
}
