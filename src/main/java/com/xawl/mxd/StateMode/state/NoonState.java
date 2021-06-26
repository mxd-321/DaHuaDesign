package com.xawl.mxd.StateMode.state;

import com.xawl.mxd.StateMode.context.Work;

/**
 * @Author mxd
 * @Date 2021/6/26 19:46
 *   中午的工作状态，从上午转变过来的
 */

public class NoonState implements State {
    @Override
    public void writeProgram(Work work) {
        if (work.getHour() < 13){
            System.out.println("当前时间: " + work.getHour() +" ,饿了，吃饭。困了，午休");
        }else {
            // 超过13点，转入下午工作状态
            work.setState(new AfternoonState());
            work.writeProgram();
        }
    }
}
