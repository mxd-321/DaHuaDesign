package com.xawl.mxd.StateMode.state;

import com.xawl.mxd.StateMode.context.Work;

/**
 * @Author mxd
 * @Date 2021/6/26 19:48
 *  下午的工作状态，从中午转变过来
 */

public class AfternoonState implements State {
    @Override
    public void writeProgram(Work work) {
        if (work.getHour() < 17){
            System.out.println("当前时间 : " + work.getHour() +" ,下午状态还行，继续努力");
        }else {
            // 超过17点，转换状态
            work.setState(new EveningState());
            work.writeProgram();
        }
    }
}
