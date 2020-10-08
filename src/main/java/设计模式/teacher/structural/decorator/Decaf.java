package com.ranger.structural.decorator;

/**
 * 描述:
 * 具体构件-无咖啡因咖啡
 *
 * @author chongguanpeng
 * @create 2019-10-12 08:49
 */
public class Decaf extends ABeverage {

    @Override
    public double cost() {
        return 12.0d;
    }

    @Override
    public String getDesc() {
        return "无咖啡因咖啡";
    }

}
