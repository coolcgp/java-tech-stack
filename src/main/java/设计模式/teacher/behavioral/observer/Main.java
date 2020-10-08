package com.ranger.behavioral.observer;

/**
 * 描述:
 * 测试
 *
 * @author chongguanpeng
 * @create 2019-10-09 20:42
 */
public class Main {


    /**
     * 方式1的不足：
     * 1. 使用subject通知，应该是生产者触发
     * 2. 再次登录，防止重复应不应该有Subject负责？
     * @param args
     */
    public static void main0(String[] args) {
        LoginSubject subject = new LoginSubject();
        subject.addObserver(new MsgObserver());
        subject.addObserver(new AwardObserver());
        subject.setUserId("冠鸟");
    }

    /**
     * 方式2
     *
     * 1.这里有个问题，用户只发布String吗？封装为对象
     * 2.每一次不new线程不安全，new安全但是有成本。如何解决？答案是引入：guava. 或者放到Spring容器中托管subject
     * 3.订阅者只希望接收到自己需要的信息，能不能类似metaQ的tag。而又不修改观察者模式的代码？？？
     *
     * @param args
     */
    public static void main(String[] args) {

        LoginSubject subject = new LoginSubject();
        subject.addObserver(new MsgObserver());
        subject.addObserver(new AwardObserver());

        LoginSubjectPublisher publisher = new LoginSubjectPublisher(subject);
        publisher.publish("冠鸟");
    }

}
