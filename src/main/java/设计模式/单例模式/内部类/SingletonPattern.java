package 设计模式.单例模式.内部类;

/**
 * @program: java-tech-stack
 * @description: 内部类
 * @author: scl chongguanpeng coolcgp@163.com
 * @create: 2020-07-21 05:16
 **/
public class SingletonPattern {

    /**
     * 名称
     */
    private String name;

    private static class SingletonPatternHolder {
        private static final SingletonPattern instance = new SingletonPattern();
    }

    private SingletonPattern() {
        this.name = "内部类";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static SingletonPattern getInstance() {
        return SingletonPatternHolder.instance;
    }
}
