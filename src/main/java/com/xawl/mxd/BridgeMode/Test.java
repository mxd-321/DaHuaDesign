package com.xawl.mxd.BridgeMode;

import com.xawl.mxd.BridgeMode.brand.HandsetBrand;
import com.xawl.mxd.BridgeMode.brand.HandsetBrandM;
import com.xawl.mxd.BridgeMode.handset.HandsetAddressList;
import com.xawl.mxd.BridgeMode.handset.HandsetGame;

/**
 * @Author mxd
 * @Date 2021/7/2 20:10
 *  桥接模式：
 *    实现系统可能有多角度分类，每一种分类都有可能变化，那么就把这种多角度分离出来让它们独立变化，减少它们的耦合
 *
 *     如果要增加一个功能 MP3, 只需要增加一个类实现 HandsetSoft 接口
 *     如果要增加一个手机品牌, 只需要增加一个类继承 HandsetBrand 类
 *     完美的体现了开放-封闭原则
 */

public class Test {
    public static void main(String[] args) {
        // 客户端调用

        // 手机品牌M
        HandsetBrand brandM = new HandsetBrandM();
        brandM.setHandsetSoft(new HandsetGame());
        brandM.run();

        brandM.setHandsetSoft(new HandsetAddressList());
        brandM.run();
    }
}
