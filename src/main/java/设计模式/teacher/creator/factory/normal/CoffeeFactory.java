package com.ranger.creator.factory.normal;

/**
 * 描述:
 * 咖啡工厂
 *
 * @author chongguanpeng
 * @create 2019-10-21 08:44
 */
public class CoffeeFactory implements BeverageFactory {
    @Override
    public Beverage createInstance() {
        return new Coffee();
    }
}
