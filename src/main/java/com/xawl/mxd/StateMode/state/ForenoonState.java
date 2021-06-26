package com.xawl.mxd.StateMode.state;

import com.xawl.mxd.StateMode.context.Work;

/**
 * @Author mxd
 * @Date 2021/6/26 19:38
 *  上午的工作状态，实现 State接口，写具体的状态逻辑
 */

public class ForenoonState implements State{
    @Override
    public void writeProgram(Work work) {
        if (work.getHour() < 12){
            System.out.println("当前时间 : " + work.getHour() + " ,上午工作，精神百倍");
        }else {
            // 超过12点，改变状态
            work.setState(new NoonState());
            work.writeProgram();
        }
    }
}
