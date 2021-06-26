package com.xawl.mxd.AbstractFactory.entity;

import java.util.Date;

/**
 * @Author mxd
 * @Date 2021/6/24 20:51
 */

public class Login {
    private Integer id;
    private Date date;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
