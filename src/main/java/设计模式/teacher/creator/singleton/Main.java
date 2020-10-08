package com.ranger.creator.singleton;

/**
 * 描述:
 * 测试入口
 *
 * @author chongguanpeng
 * @create 2019-10-15 08:48
 */
public class Main {


    public static void main(String[] args) {
        Runnable r1 = ()->{
            EnumSingleton instance = EnumSingleton.getInstance();
            System.out.println(instance.toString());
        };

        Runnable r2 = ()->{
            EnumSingleton instance = EnumSingleton.getInstance();
            System.out.println(instance.toString());
        };

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        t1.start();
        t2.start();
    }
}
