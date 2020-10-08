package com.ranger.creator.factory.simple;

/**
 * 描述:
 * 饮料类型
 *
 * @author chongguanpeng
 * @create 2019-10-21 08:25
 */
public enum BeverageTypeEnum {
    /**
     * 无糖可乐
     */
    DIET_COKE((short) 1, "无糖可乐"),
    /**
     * 可乐
     */
    COLA((short) 2, "可乐");

    /**
     * 类型
     */
    private Short type;

    /**
     * 名称
     */
    private String name;

    BeverageTypeEnum(Short type, String name) {
        this.type = type;
        this.name = name;
    }

    public Short getType() {
        return type;
    }

    public String getName() {
        return name;
    }
}
