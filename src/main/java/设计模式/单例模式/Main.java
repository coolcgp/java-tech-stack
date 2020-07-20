package 设计模式.单例模式;

//import 设计模式.单例模式.饿汉式.SingletonPattern;
//import 设计模式.单例模式.懒汉式.SingletonPattern;
import 设计模式.单例模式.内部类.SingletonPattern;

/**
 * @program: java-tech-stack
 * @description: 测试入口
 * @author: scl chongguanpeng coolcgp@163.com wechat: GeorgeChongVIP
 * @create: 2020-07-21 05:24
 **/
public class Main {

    public static void main(String[] args) {
        SingletonPattern singletonPattern = SingletonPattern.getInstance();
        System.out.println(singletonPattern.getName());
    }
}
