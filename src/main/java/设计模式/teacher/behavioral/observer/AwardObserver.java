package com.ranger.behavioral.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * 描述:
 * 奖励
 *
 * @author chongguanpeng
 * @create 2019-10-09 20:43
 */
public class AwardObserver implements Observer {

    private Observable observable;

    @Override
    public void update(Observable o, Object arg) {
        this.observable = o;
        System.out.println("为" + (String) arg + "增加每日登录奖励");
    }

    public void unregister() {
        this.observable.deleteObserver(this);
    }

}
