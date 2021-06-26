package com.xawl.mxd.StateMode.state;

import com.xawl.mxd.StateMode.context.Work;

/**
 * @Author mxd
 * @Date 2021/6/26 19:33
 *    定义了一个所有具体状态的共同接口；任何状态都实现这个相同的接口，这样一来，状态之间可以互相替换
 */

public interface State {

    /**
     * 工作的方法，不同的时间点，工作精神不同
     * @param work
     */
    public void writeProgram(Work work);
}
