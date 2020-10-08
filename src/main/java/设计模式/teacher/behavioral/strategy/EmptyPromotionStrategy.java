package com.ranger.behavioral.strategy;

/**
 * 描述:
 * 空促销实现_兜底
 *
 * @author chongguanpeng
 * @create 2019-10-09 09:26
 */
public class EmptyPromotionStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("什么也不做");
    }
}
