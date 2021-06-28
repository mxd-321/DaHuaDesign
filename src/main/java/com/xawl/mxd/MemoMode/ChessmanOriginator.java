package com.xawl.mxd.MemoMode;

/**
 * @Author mxd
 * @Date 2021/6/28 20:12
 *  原发器：它是一个普通的类，可以创建一个备忘录，并存储它的当前内部状态，也可以使用备忘录来恢复其内部状态。
 */

public class ChessmanOriginator {
    /**
     * 棋子
     */
    private String label;
    /**
     * 所下的位置
     */
    private int x;
    private int y;

    public ChessmanOriginator(String label, int x, int y) {
        this.label = label;
        this.x = x;
        this.y = y;
    }

    /**
     * 保存备忘录
     * @return
     */
    public ChessmanMemento save() {
        return new ChessmanMemento(this.label,this.x,this.y);
    }

    /**
     * 读取最近的备忘录，恢复原来的状态
     */
    public void restore(ChessmanMemento chessmanMemento) {
        this.label = chessmanMemento.getLabel();
        this.x = chessmanMemento.getX();
        this.y = chessmanMemento.getY();
    }

    public void show() {
        System.out.printf("棋子<%s>：当前位置为：<%d, %d>%n", this.getLabel(), this.getX(), this.getY());
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
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
