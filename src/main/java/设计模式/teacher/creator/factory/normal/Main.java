package com.ranger.creator.factory.normal;

/**
 * 描述:
 * 入口
 *
 * @author chongguanpeng
 * @create 2019-10-21 08:44
 */
public class Main {

    public static void main(String[] args) {
        // 工厂方法，不再由入参决定，而是由工厂来决定
        BeverageFactory factory = new CoffeeFactory();
        Beverage instance = factory.createInstance();
        System.out.println(instance.getName());
    }
}
