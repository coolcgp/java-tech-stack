package com.ranger.behavioral.strategy;

/**
 * 描述:
 * 返现策略实现
 *
 * @author chongguanpeng
 * @create 2019-10-09 09:23
 */
public class FanxianPromotionStrategy implements PromotionStrategy {

    @Override
    public void doPromotion() {
        System.out.println("返现100元到用户钱包中");
    }
}
