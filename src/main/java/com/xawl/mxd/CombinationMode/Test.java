package com.xawl.mxd.CombinationMode;

/**
 * @Author mxd
 * @Date 2021/6/29 19:52
 *  组合模式：将对象组合成树形结构以表示 "部分 - 整体"的层次结构。
 *        组合模式使得用户对单个对象和组合对象的使用具有一致性
 */

public class Test {

    public static void main(String[] args) {
        // 客户端调用
        ConcreteCompany root = new ConcreteCompany("北京总公司");
        root.add(new HrDepartment("总公司人力资源部"));
        root.add(new FinanceDepartment("总公司财务部"));

        ConcreteCompany company1 = new ConcreteCompany("上海分公司");
        company1.add(new HrDepartment("上海分公司人力资源部"));
        company1.add(new FinanceDepartment("上海分公司财务部"));
        root.add(company1);

        ConcreteCompany company2 = new ConcreteCompany("杭州分公司");
        company2.add(new HrDepartment("杭州分公司人力资源部"));
        company2.add(new FinanceDepartment("杭州分公司财务部"));
        root.add(company2);

        System.out.println("公司结构图:");
        root.display(1);

        System.out.println();
        System.out.println("各个公司的业务:");
        root.business();
    }
}
