package com.ranger.creator.factory.abstracte;

/**
 * 描述:
 * 百事工厂
 *
 * @author chongguanpeng
 * @create 2019-10-21 08:56
 */
public class PepsiFactory implements BeverageFactory {


    @Override
    public Coffee createCoffee() {
        return new PepsiCoffee();
    }

    @Override
    public Cola createCola() {
        return new PepsiCola();
    }
}
