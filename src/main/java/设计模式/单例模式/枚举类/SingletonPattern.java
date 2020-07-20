package 设计模式.单例模式.枚举类;

/**
 * @program: java-tech-stack
 * @description: 枚举类
 * @author: scl chongguanpeng coolcgp@163.com wechat: GeorgeChongVIP
 * @create: 2020-07-21 06:08
 **/
public enum SingletonPattern {

    INSTANCE;

    /**
     * 名称
     */
    private String name;

    private SingletonPattern() {
        this.name = "枚举类";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static SingletonPattern getInstance() {
        return INSTANCE;
    }
}
