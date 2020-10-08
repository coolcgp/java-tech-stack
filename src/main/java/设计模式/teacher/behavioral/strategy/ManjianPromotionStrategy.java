package com.ranger.behavioral.strategy;

/**
 * 描述:
 * 满减促销策略
 *
 * @author chongguanpeng
 * @create 2019-10-09 09:24
 */
public class ManjianPromotionStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("满减促销，每满100减30元");
    }
}
