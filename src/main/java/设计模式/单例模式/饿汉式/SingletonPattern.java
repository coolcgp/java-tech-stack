package 设计模式.单例模式.饿汉式;

/**
 * @program: java-tech-stack
 * @description: 饿汉式
 * @author: scl chongguanpeng coolcgp@163.com
 * @create: 2020-07-21 05:16
 **/
public class SingletonPattern {

    /**
     * 名称
     */
    private String name;

    private static final SingletonPattern instance = new SingletonPattern();

    private SingletonPattern() {
        this.name = "饿汉式";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static SingletonPattern getInstance() {
        return instance;
    }
}
