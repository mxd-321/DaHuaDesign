package com.xawl.mxd.StateMode;

import com.xawl.mxd.StateMode.context.Work;

/**
 * @Author mxd
 * @Date 2021/6/26 19:26
 *  状态模式： 当控制一个对象的状态转换时，写了很多的 if-else 语句 或者条件表达式过于复杂时，
 *         把状态的判断逻辑转移到表示不同状态的一系列类当中，可以把复杂的判断逻辑简单化
 */

public class Test {
    public static void main(String[] args) {
        Work work = new Work();
        work.setHour(9);
        work.writeProgram();

        work.setHour(11);
        work.writeProgram();

        work.setHour(12);
        work.writeProgram();

        work.setHour(13);
        work.writeProgram();

        work.setHour(14);
        work.writeProgram();

        work.setHour(17);
        work.writeProgram();

        work.setFinish(true);

        work.setHour(19);
        work.writeProgram();

        work.setHour(22);
        work.writeProgram();
    }
}
