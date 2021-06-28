package com.xawl.mxd.MemoMode;

/**
 * @Author mxd
 * @Date 2021/6/28 19:56
 *  备忘录模式：在不破坏封装性的前提下，捕获一个对象的内部状态，并在该对象之外保存这个状态。
 *              这样以后就可以将该对象恢复到原先保存的状态
 *    优点：它提供了一种状态恢复的实现机制，使得用户可以方便地回到一个特定的历史步骤，
 *             当新的状态无效或者存在问题时，可以使用暂时存储起来的备忘录将状态复原。
 */

public class Test {
    /**
     * 备忘录管理者
     */
    private static MementoCaretaker mementoCaretaker = new MementoCaretaker();

    public static void main(String[] args) {
        // 客户端代码
        // 开始下棋
        ChessmanOriginator originator = new ChessmanOriginator("车",1,1);
        originator.show();
        // 保存一起状态并且添加进备忘录
        mementoCaretaker.addMemento(originator.save());

        // 继续下棋
        originator.setY(4);
        originator.show();
        // 保存一起状态并且添加进备忘录
        mementoCaretaker.addMemento(originator.save());

        // 继续下棋
        originator.setX(4);
        originator.show();
        // 保存一起状态并且添加进备忘录
        mementoCaretaker.addMemento(originator.save());

        // 悔棋
        System.out.println("悔棋");
        originator.restore(mementoCaretaker.getMemento());
        originator.show();

        System.out.println("在悔棋一步");
        originator.restore(mementoCaretaker.getMemento());
        originator.show();


    }
}
