package com.xawl.mxd.prototype;

/**
 * @Author mxd
 * @Date 2021/6/16 9:21
 *  简历模板
 */

public class Resume implements Cloneable{
    private final String name;
    private String sex;
    private Integer age;
    private String timeAre;
    private String company;

    public Resume(String name) {
        this.name = name;
    }

    /**
     * 设置个人信息
     */
    public void setPersonalInfo(String sex,Integer age){
        this.sex = sex;
        this.age = age;
    }

    /**
     * 设置工作经历
     */
    public void setWorkExperience(String timeAre, String company){
        this.timeAre = timeAre;
        this.company = company;
    }

    public void show(){
        System.out.println(name + " " + sex + " " + age + " ");
        System.out.println(timeAre + " " + company);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
