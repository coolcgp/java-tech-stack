package com.ranger.behavioral.strategy;

/**
 * 描述:
 * 立减促销策略实现
 *
 * @author chongguanpeng
 * @create 2019-10-09 09:25
 */
public class LijianPromotionStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("原地立减20元");
    }
}
