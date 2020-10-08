package com.ranger.creator.factory.abstracte;

/**
 * 描述:
 * 饮料工厂
 *
 * @author chongguanpeng
 * @create 2019-10-21 08:46
 */
public interface BeverageFactory {
    /**
     * 生产咖啡
     */
    Coffee createCoffee();

    /**
     * 生产可乐
     */
    Cola createCola();
}
