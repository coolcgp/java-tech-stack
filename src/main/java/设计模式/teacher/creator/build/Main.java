package com.ranger.creator.build;

/**
 * 描述:
 * 入口
 *
 * @author chongguanpeng
 * @create 2019-10-21 09:02
 */
public class Main {


    public static void main(String[] args) {
        Computer computer = new Computer.Builder()
                .setId(1L)
                .setKeyboard("大F机械键盘")
                .setMouse("无线鼠标")
                .setScreen("14寸惠普显示器")
                .build();
        System.out.println(computer.toString());
    }
}
