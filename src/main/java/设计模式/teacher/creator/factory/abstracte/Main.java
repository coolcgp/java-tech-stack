package com.ranger.creator.factory.abstracte;

/**
 * 描述:
 * 入口
 *
 * @author chongguanpeng
 * @create 2019-10-21 08:59
 */
public class Main {

    public static void main(String[] args) {
        BeverageFactory factory = new CocaFactory();
        Coffee coffee = factory.createCoffee();
        System.out.println(coffee.type() + " " + coffee.name());
    }
}
