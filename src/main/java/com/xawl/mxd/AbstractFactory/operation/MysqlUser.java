package com.xawl.mxd.AbstractFactory.operation;

import com.xawl.mxd.AbstractFactory.entity.User;

/**
 * @Author mxd
 * @Date 2021/6/24 20:42
 */

public class MysqlUser implements IUser{
    @Override
    public void insert(User user) {
        System.out.println("在MySQL数据库中插入一条数据");
    }

    @Override
    public User getUser(Integer id) {
        System.out.println("在mysql中的user表得到id为"+id+"的一条数据");
        return null;
    }
}
