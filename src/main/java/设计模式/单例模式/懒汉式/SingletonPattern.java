package 设计模式.单例模式.懒汉式;

/**
 * @program: java-tech-stack
 * @description: 懒汉式
 * @author: scl chongguanpeng coolcgp@163.com
 * @create: 2020-07-21 05:16
 **/
public class SingletonPattern {

    /**
     * 名称
     */
    private String name;

    private static volatile SingletonPattern instance = null;

    private SingletonPattern() {
        this.name = "懒汉式";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static synchronized SingletonPattern getInstance() {
        if (instance == null) {
            // 当下是安全的。不加volatile（禁止指令重排序）不安全的原因。
            // 1. 栈上 instance
            // 2. 栈上指向堆
            // 3. 堆上 new SingletonPattern()
            instance = new SingletonPattern();
        }
        return instance;
    }
}
