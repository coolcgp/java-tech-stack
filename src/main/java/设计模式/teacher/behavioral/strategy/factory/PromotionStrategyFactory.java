package com.ranger.behavioral.strategy.factory;

import com.ranger.behavioral.strategy.*;

/**
 * 描述:
 * 促销策略模式工厂
 *
 * @author chongguanpeng
 * @create 2019-10-09 09:40
 */
public class PromotionStrategyFactory {

    private PromotionStrategyFactory() {

    }

    public static PromotionStrategy create(PromotionStrategyEnum strategyEnum) {
        if (PromotionStrategyEnum.FAN_XIAN.equals(strategyEnum)) {
            return new FanxianPromotionStrategy();
        } else if (PromotionStrategyEnum.LI_JIAN.equals(strategyEnum)) {
            return new LijianPromotionStrategy();
        } else if (PromotionStrategyEnum.MAN_JIAN.equals(strategyEnum)) {
            return new ManjianPromotionStrategy();
        } else {
            return new EmptyPromotionStrategy();
        }
    }
}
