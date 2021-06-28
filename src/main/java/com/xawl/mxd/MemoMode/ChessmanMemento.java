package com.xawl.mxd.MemoMode;

/**
 * @Author mxd
 * @Date 2021/6/28 20:15
 *  备忘录角色，负责存储ChessmanOriginator对象的内部状态，并且防止 Originator 以外的其他对象访问备忘录
 */

public class ChessmanMemento {
    private String label;
    private int x;
    private int y;

    public ChessmanMemento(String label, int x, int y) {
        this.label = label;
        this.x = x;
        this.y = y;
    }

    public String getLabel() {
        return label;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
