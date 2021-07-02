package com.xawl.mxd.BridgeMode.brand;

import com.xawl.mxd.BridgeMode.handset.HandsetSoft;

/**
 * @Author mxd
 * @Date 2021/7/2 20:17
 *  手机品牌的抽象类
 */

public abstract class HandsetBrand {
    protected HandsetSoft soft;

    /**
     * 设置手机软件
     * @param soft
     */
    public void setHandsetSoft(HandsetSoft soft){
        this.soft = soft;
    }

    /**
     * 运行软件
     */
    public abstract void run();
}
