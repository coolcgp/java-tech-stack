package com.ranger.creator.factory.abstracte;

/**
 * 描述:
 * 可口工厂
 *
 * @author chongguanpeng
 * @create 2019-10-21 08:56
 */
public class CocaFactory implements BeverageFactory {


    @Override
    public Coffee createCoffee() {
        return new CocaCoffee();
    }

    @Override
    public Cola createCola() {
        return new CocaCola();
    }
}
