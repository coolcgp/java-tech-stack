package com.ranger.structural.decorator;

/**
 * 描述:
 * 具体构件-咖啡
 *
 * @author chongguanpeng
 * @create 2019-10-12 08:25
 */
public class Coffee extends ABeverage {

    @Override
    public double cost() {
        return 10.0d;
    }

    @Override
    public String getDesc() {
        return "咖啡";
    }

    public static void main(String[] args) {
        Coffee coffee = new Coffee();
        System.out.println(coffee.getDesc());
    }
}
