package com.xawl.mxd.StateMode.state;

import com.xawl.mxd.StateMode.context.Work;

/**
 * @Author mxd
 * @Date 2021/6/26 19:56
 */

public class SleepingState implements State {
    @Override
    public void writeProgram(Work work) {
        System.out.println("当前时间: " + work.getHour() + " ,不行了，睡觉了");
    }
}
