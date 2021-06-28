package com.xawl.mxd.MemoMode;


import java.util.ArrayList;
import java.util.List;

/**
 * @Author mxd
 * @Date 2021/6/28 20:20
 *  备忘录管理者：负责保存好备忘录，不可以对备忘录的内容进行操作
 */

public class MementoCaretaker {
    /**
     * 定义一个list集合存储备忘录
     */
    private List<ChessmanMemento> mementoList = new ArrayList<>();
    private int index;

    /**
     * 获取备忘录
     * @return
     */
    public ChessmanMemento getMemento() {
        index--;
        if (index > 0){
            return mementoList.get(index-1);
        }

        throw new RuntimeException("不可以在悔棋了");
    }

    /**
     * 添加一个备忘录
     */
    public void addMemento(ChessmanMemento memento) {
        mementoList.add(memento);
        index++;
    }

}
