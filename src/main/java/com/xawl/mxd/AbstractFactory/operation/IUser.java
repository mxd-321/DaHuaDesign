package com.xawl.mxd.AbstractFactory.operation;

import com.xawl.mxd.AbstractFactory.entity.User;

/**
 * @Author mxd
 * @Date 2021/6/24 20:41
 *  定义一个对User进行操作的接口
 */

public interface IUser {
    /**
     * 插入一个 User
     * @param user
     */
    public void insert(User user);

    /**
     * 返回一个 User
     * @param id
     * @return
     */
    public User getUser(Integer id);
}
