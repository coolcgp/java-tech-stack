package com.ranger.creator.factory.normal;

/**
 * 描述:
 * 饮料工厂
 *
 * @author chongguanpeng
 * @create 2019-10-21 08:37
 */
public interface BeverageFactory {
    /**
     * 不再由入参决定，生产何种饮料
     */
    Beverage createInstance();
}
