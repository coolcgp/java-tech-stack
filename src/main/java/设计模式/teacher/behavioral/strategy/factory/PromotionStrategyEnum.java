package com.ranger.behavioral.strategy.factory;

/**
 * 描述:
 * 促销策略枚举类型
 *
 * @author chongguanpeng
 * @create 2019-10-09 09:41
 */
public enum PromotionStrategyEnum {

    /**
     * 返现
     */
    FAN_XIAN((short) 10),
    /**
     * 满减
     */
    MAN_JIAN((short) 20),
    /**
     * 立减
     */
    LI_JIAN((short) 30);

    private Short type;

    PromotionStrategyEnum(Short type) {
        this.type = type;
    }

    public Short getType() {
        return type;
    }
}
