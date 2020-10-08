package com.ranger.behavioral.command;

/**
 * 描述:
 * 命令的接受者
 *
 * @author chongguanpeng
 * @create 2019-10-18 00:03
 */
public class Receiver {

    public void doAction() {
        System.out.println("doAction");
    }

    public void undoAction() {
        System.out.println("undoAction");
    }
}
