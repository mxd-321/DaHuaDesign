package com.xawl.mxd.StateMode.context;

import com.xawl.mxd.StateMode.state.ForenoonState;
import com.xawl.mxd.StateMode.state.State;

/**
 * @Author mxd
 * @Date 2021/6/26 19:36
 */

public class Work {
    private State state;
    /**
     * "钟点" 属性，状态改变的依据
     */
    private double hour;
    /**
     * "任务完成" 属性，是否能下班的依据
     */
    private boolean finish;

    public Work() {
        // 初始化为上午的工作状态
        state = new ForenoonState();
    }

    public void writeProgram() {
        state.writeProgram(this);
    }

    public void setState(State state) {
        this.state = state;
    }

    public double getHour() {
        return hour;
    }

    public void setHour(double hour) {
        this.hour = hour;
    }

    public boolean isFinish() {
        return finish;
    }

    public void setFinish(boolean finish) {
        this.finish = finish;
    }
}
