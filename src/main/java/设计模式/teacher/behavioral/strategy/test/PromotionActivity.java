package com.ranger.behavioral.strategy.test;

import com.ranger.behavioral.strategy.PromotionStrategy;

/**
 * 描述:
 * 促销活动。促销活动中需要拥有促销策略的能力
 *
 * @author chongguanpeng
 * @create 2019-10-09 09:31
 */
public class PromotionActivity {

    private PromotionStrategy promotionStrategy;

    public PromotionActivity(PromotionStrategy promotionStrategy) {
        this.promotionStrategy = promotionStrategy;
    }

    public void start() {
        this.promotionStrategy.doPromotion();
    }
}
