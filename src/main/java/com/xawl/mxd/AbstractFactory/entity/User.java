package com.xawl.mxd.AbstractFactory.entity;

/**
 * @Author mxd
 * @Date 2021/6/24 20:37
 *  用户类，数据库中的具体表
 */

public class User {
    private Integer id;
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
