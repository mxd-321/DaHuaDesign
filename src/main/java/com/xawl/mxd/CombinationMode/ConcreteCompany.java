package com.xawl.mxd.CombinationMode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author mxd
 * @Date 2021/6/29 20:03
 *  具体的公司类，实现接口。 相当于树枝节点
 */

public class ConcreteCompany extends Company{
    /**
     * 存放该公司下的子公司
     */
    private final List<Company> children = new ArrayList<>();

    public ConcreteCompany(String name) {
        super(name);
    }

    @Override
    public void add(Company company) {
        children.add(company);
    }

    @Override
    public void remove(Company company) {
        children.remove(company);
    }

    @Override
    public void display(int depth) {
        System.out.println(this.getName());
        for (Company child : children) {
            child.display(1);
        }
    }

    @Override
    public void business() {
        for (Company child : children) {
            child.business();
        }
    }


}
