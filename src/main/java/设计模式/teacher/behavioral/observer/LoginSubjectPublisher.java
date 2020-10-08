package com.ranger.behavioral.observer;

/**
 * 描述:
 * 发布者
 *
 * @author chongguanpeng
 * @create 2019-10-09 20:53
 */
public class LoginSubjectPublisher {

    private LoginSubject delegate;


    public LoginSubjectPublisher() {
    }

    public LoginSubjectPublisher(LoginSubject delegate) {
        this.delegate = delegate;
    }

    public LoginSubject getDelegate() {
        return delegate;
    }

    public void setDelegate(LoginSubject delegate) {
        this.delegate = delegate;
    }

    public void publish(String userId) {
        // 不要判断this.subject为空，易读
        this.delegate.setUserId(userId);
    }
}
