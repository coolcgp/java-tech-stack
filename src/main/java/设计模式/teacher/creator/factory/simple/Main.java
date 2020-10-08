package com.ranger.creator.factory.simple;

/**
 * 描述:
 * 入口
 *
 * @author chongguanpeng
 * @create 2019-10-21 08:34
 */
public class Main {

    public static void main(String[] args) {
        Beverage beverage = BeverageFactory.createInstance(BeverageTypeEnum.COLA);
        System.out.println(beverage.getName());
    }
}
