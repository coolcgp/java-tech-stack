package com.ranger.behavioral.observer;

import java.util.Observable;

/**
 * 描述:
 * 登录主题
 *
 * @author chongguanpeng
 * @create 2019-10-09 20:34
 */
public class LoginSubject extends Observable {

    private String userId;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
        super.setChanged();
        super.notifyObservers(userId);
    }
}
