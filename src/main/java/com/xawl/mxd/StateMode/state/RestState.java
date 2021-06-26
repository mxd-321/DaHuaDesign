package com.xawl.mxd.StateMode.state;

import com.xawl.mxd.StateMode.context.Work;

/**
 * @Author mxd
 * @Date 2021/6/26 19:52
 *  下班状态，由晚间工作状态转变
 */

public class RestState implements State {
    @Override
    public void writeProgram(Work work) {
        System.out.println("当前时间 : " + work.getHour() + " ,下班回家了");
    }
}
