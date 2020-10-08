package com.ranger.creator.factory.normal;

/**
 * 描述:
 * 可乐工厂
 *
 * @author chongguanpeng
 * @create 2019-10-21 08:41
 */
public class ColaFactory implements BeverageFactory {

    @Override
    public Beverage createInstance() {
        return new Cola();
    }
}
