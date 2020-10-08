package com.ranger.creator.factory.simple;

/**
 * 描述:
 * 可乐
 *
 * @author chongguanpeng
 * @create 2019-10-21 08:30
 */
public class Cola extends Beverage {
    @Override
    public String getName() {
        return BeverageTypeEnum.COLA.getName();
    }
}
