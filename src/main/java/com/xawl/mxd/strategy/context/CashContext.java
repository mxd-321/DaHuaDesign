package com.xawl.mxd.strategy.context;

import com.xawl.mxd.strategy.algorithm.CashNormal;
import com.xawl.mxd.strategy.algorithm.CashRebate;
import com.xawl.mxd.strategy.algorithm.CashReturn;
import com.xawl.mxd.strategy.algorithm.CashSuper;

/**
 * @Author mxd
 * @Date 2021/4/26 11:00
 *
 */

public class CashContext {

    private final CashSuper cashSuper;

    /**
     * 初始化具体的策略
     * @param type
     */
    public CashContext(String type) {
        switch (type){
            case "正常收费":
                cashSuper = new CashNormal();
                break;
            case "打8折":
                cashSuper = new CashRebate(0.8);
                break;
            case "满300返100":
                cashSuper = new CashReturn(300,100);
                break;
            default:
                cashSuper = null;
        }
    }

    /**
     * 根据具体的策略，调用相应的实现算法
     * @param money
     * @return
     */
    public double getResult(double money){
        try {
            money = cashSuper.acceptCash(money);
        }catch (Exception e){
            System.out.println("您输入的策略暂时没有");
        }
        return money;
    }
}
