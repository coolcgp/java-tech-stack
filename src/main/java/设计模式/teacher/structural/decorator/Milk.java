package com.ranger.structural.decorator;

/**
 * 描述:
 * 具体装饰-牛奶
 *
 * @author chongguanpeng
 * @create 2019-10-12 08:58
 */
public class Milk extends CondimentDecorator {

    public Milk(ABeverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return 5.0d + beverage.cost();
    }

    @Override
    public String getDesc() {
        return beverage.getDesc() + " 牛奶";
    }
}
