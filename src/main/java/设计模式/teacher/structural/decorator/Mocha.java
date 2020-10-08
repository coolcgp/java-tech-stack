package com.ranger.structural.decorator;

/**
 * 描述:
 * 具体装饰-摩卡
 *
 * @author chongguanpeng
 * @create 2019-10-12 08:40
 */
public class Mocha extends CondimentDecorator {

    public Mocha(ABeverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return 2.0 + beverage.cost();
    }

    @Override
    public String getDesc() {
        return beverage.getDesc() + " 摩卡";
    }
}
