package com.ranger.creator.factory.simple;

/**
 * 描述:
 * 无糖可乐
 *
 * @author chongguanpeng
 * @create 2019-10-21 08:29
 */
public class DietCoke extends Beverage {
    @Override
    public String getName() {
        return BeverageTypeEnum.DIET_COKE.getName();
    }
}
