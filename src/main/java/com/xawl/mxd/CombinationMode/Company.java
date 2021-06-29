package com.xawl.mxd.CombinationMode;

/**
 * @Author mxd
 * @Date 2021/6/29 19:57
 *  Company类代表各个公司，部门的抽象类
 */

public abstract class Company {
    private String name;

    public Company(String name) {
        this.name = name;
    }

    /**
     * 添加子公司或者子部门
     * @param company
     */
    public abstract void add(Company company);

    /**
     * 移除子公司或者子部门
     * @param company
     */
    public abstract void remove(Company company);

    /**
     * 显示当前公司下的子公司和部门
     * @param depth
     */
    public abstract void display(int depth);

    /**
     * 每个公司或者部门的具体业务
     */
    public abstract void business();

    public String getName() {
        return name;
    }
}
