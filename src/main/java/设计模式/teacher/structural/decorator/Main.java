package com.ranger.structural.decorator;

/**
 * 描述:
 * 测试入口
 *
 * @author chongguanpeng
 * @create 2019-10-12 08:56
 */
public class Main {

    public static void main(String[] args) {

        ABeverage beverage = new Coffee();
        beverage = new Mocha(beverage);
        beverage = new Milk(beverage);
        beverage = new Milk(beverage);
        System.out.println(beverage.getDesc() + " " + beverage.cost());
    }
}
