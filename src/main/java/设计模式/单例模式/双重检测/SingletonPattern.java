package 设计模式.单例模式.双重检测;

/**
 * @program: java-tech-stack
 * @description: 双重检测
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
        this.name = "双重检测";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * 加volatile的原因
     * instance = new SingletonPattern(); 分为3个步骤
     * 1. 堆上分配内存
     * 2. 栈上的变量指向堆内存
     * 3. 堆上创建对象 new SinglePattern（创建内部对象1：dbConn; 创建内部对象2：socketClient）
     * 创建对象不是原子性操作，可能执行步骤2时，步骤3尚未执行结束（内部对象尚未创建成功），
     * 此时立即调用 singletonPattern的socketClient会出错
     *
     * @return
     */
    public static SingletonPattern getInstance() {
        if (instance == null) {
            synchronized (SingletonPattern.class) {
                instance = new SingletonPattern();
            }
        }
        return instance;
    }
}
