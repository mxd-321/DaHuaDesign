package com.xawl.mxd.test;

import org.junit.Test;

/**
 * @Author mxd
 * @Date 2021/5/27 16:38
 *  结论：初始化子类时，若父类没有初始化，则先初始化父类、
 *      父类优先、静态先行、非静态比构造优先
 */

public class Main {

    @Test
    public void method1() {
        /**
         * parent static
         * son static
         * parent no static
         * parent 构造
         * son no static
         * son 构造
         */
        new Son();
    }

    /**
     * parent static
     * son static
     * parent no static
     * parent 构造
     * son no static
     * son 构造
     *
     * parent no static
     * parent 构造
     * son no static
     * son 构造
     */
    @Test
    public void method2() {
        new Son();
        System.out.println();
        new Son();
    }

    /**
     * parent static
     * son static
     * parent no static
     * parent 构造
     * son no static
     * son 构造
     *
     * parent no static
     * parent 构造
     */
    @Test
    public void method3() {
        new Son();
        System.out.println();
        new Parent();
    }

    /**
     * parent static
     * parent no static
     * parent 构造
     */
    @Test
    public void method4() {
        new Parent();
    }

    /**
     * parent static
     * parent no static
     * parent 构造
     *
     * son static
     * parent no static
     * parent 构造
     * son no static
     * son 构造
     */
    @Test
    public void method5() {
        new Parent();
        System.out.println();
        new Son();
    }

    /**
     * parent static
     * parent no static
     * parent 构造
     *
     * parent no static
     * parent 构造
     */
    @Test
    public void method6() {
        new Parent();
        System.out.println();
        new Parent();
    }
}
