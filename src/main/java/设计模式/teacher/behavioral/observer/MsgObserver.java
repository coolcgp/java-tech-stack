package com.ranger.behavioral.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * 描述:
 * 通知
 *
 * @author chongguanpeng
 * @create 2019-10-09 20:35
 */
public class MsgObserver implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        System.out.println((String) arg + "，您有新的消息，请注意查收");
    }

}
