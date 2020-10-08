package com.ranger.structural.facade;

/**
 * 描述:
 * 测试入口
 *
 * @author chongguanpeng
 * @create 2019-10-16 09:18
 */
public class Main {

    public static void main(String[] args) {
        User user = new User("142581", "guanniao", "上海市杨浦公园",100);
        Gift gift = new Gift("机械键盘");

        FacadeMain facadeMain = new FacadeMain();
        facadeMain.exchangeGift(user, gift);
    }
}
