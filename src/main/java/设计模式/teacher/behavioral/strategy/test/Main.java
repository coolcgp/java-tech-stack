package com.ranger.behavioral.strategy.test;

import com.ranger.behavioral.strategy.FanxianPromotionStrategy;
import com.ranger.behavioral.strategy.ManjianPromotionStrategy;
import com.ranger.behavioral.strategy.factory.PromotionStrategyEnum;
import com.ranger.behavioral.strategy.factory.PromotionStrategyFactory;

/**
 * 描述:
 * 测试入口
 *
 * @author chongguanpeng
 * @create 2019-10-09 09:28
 */
public class Main {

    /**
     * 方式1：原生的策略模式
     * <p>
     * 不足：
     * 1. 需要知道所有的促销策略；
     * 2. 想动态切换策略，只能硬编码
     */
    public static void main0(String[] args) {

        PromotionActivity activity618 = new PromotionActivity(new FanxianPromotionStrategy());
        activity618.start();

        PromotionActivity activity1111 = new PromotionActivity(new ManjianPromotionStrategy());
        activity1111.start();

        // 希望通过工厂的方式，获取不同的策略。
        // 目标：new PromotionActivity(PromotionStrategyFactory.create(PromotionStrategyEnum.FAN_XIAN));
    }

    /**
     * 方式2：
     * 1. 只需查看PromotionStrategyEnum知道所有的促销策略。
     * 2. 也可以灵活切换不同的策略了。
     *
     * 不足:
     * 能否动态配置，比如运营同学希望从 "满减" 切换到 "立减"
     *
     * @param args
     */
    public static void main(String[] args) {
        PromotionActivity activity618 = new PromotionActivity(PromotionStrategyFactory.create(PromotionStrategyEnum.FAN_XIAN));
        activity618.start();

        PromotionActivity activity1111 = new PromotionActivity(PromotionStrategyFactory.create(PromotionStrategyEnum.MAN_JIAN));
        activity1111.start();

        PromotionActivity activity = new PromotionActivity(PromotionStrategyFactory.create(null));
        activity.start();

    }
}
