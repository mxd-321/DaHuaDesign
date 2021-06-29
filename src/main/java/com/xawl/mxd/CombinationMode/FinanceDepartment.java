package com.xawl.mxd.CombinationMode;

/**
 * @Author mxd
 * @Date 2021/6/29 20:16
 *  财务部 树叶节点
 */

public class FinanceDepartment extends Company {

    public FinanceDepartment(String name) {
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
        System.out.println(this.getName() + "  公司财务收支管理");
    }
}
