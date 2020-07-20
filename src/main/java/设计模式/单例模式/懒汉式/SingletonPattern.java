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

    private static SingletonPattern instance = null;

    private SingletonPattern() {
        this.name = "懒汉式";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * 效率低的原因，每次调用 getInstance() 不能并发
     * @return
     */
    public static synchronized SingletonPattern getInstance() {
        if (instance == null) {
            instance = new SingletonPattern();
        }
        return instance;
    }
}
