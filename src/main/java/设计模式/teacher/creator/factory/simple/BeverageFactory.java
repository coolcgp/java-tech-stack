package com.ranger.creator.factory.simple;

/**
 * 描述:
 * 可乐工厂
 *
 * @author chongguanpeng
 * @create 2019-10-21 08:27
 */
public class BeverageFactory {

    /**
     * 饮料工厂
     */
    public static Beverage createInstance(BeverageTypeEnum typeEnum) {
        if (BeverageTypeEnum.COLA.equals(typeEnum)) {
            return new Cola();
        } else if (BeverageTypeEnum.DIET_COKE.equals(typeEnum)) {
            return new DietCoke();
        } else {
            return null;
        }
    }

}
