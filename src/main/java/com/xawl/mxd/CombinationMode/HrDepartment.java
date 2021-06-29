package com.xawl.mxd.CombinationMode;

/**
 * @Author mxd
 * @Date 2021/6/29 20:14
 *  人力资源部 ，相当于树叶节点
 */

public class HrDepartment extends Company{
    public HrDepartment(String name) {
        super(name);
    }

    @Override
    public void add(Company company) {
        // 无具体实现
    }

    @Override
    public void remove(Company company) {
        // 无具体实现
    }

    @Override
    public void display(int depth) {
        System.out.println(this.getName());
    }

    @Override
    public void business() {
        System.out.println(this.getName() + " 员工培训管理");
    }
}
