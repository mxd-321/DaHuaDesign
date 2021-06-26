package com.xawl.mxd.StateMode.state;

import com.xawl.mxd.StateMode.context.Work;

/**
 * @Author mxd
 * @Date 2021/6/26 19:50
 *  晚间的工作状态，从下午转变过来。
 */

public class EveningState implements State {
    @Override
    public void writeProgram(Work work) {
        // 判断工作是否完成
        if (work.isFinish()){
            // 如果完成任务，则转入下班状态
            work.setState(new RestState());
            work.writeProgram();
        }else {
            if (work.getHour() < 21){
                System.out.println("当前时间: " + work.getHour() +" ,加班很累");
            }else {
                // 超过21点，转入睡觉时间
                work.setState(new SleepingState());
                work.writeProgram();
            }
        }
    }
}
