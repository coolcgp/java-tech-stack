package com.ranger.behavioral.command;

/**
 * 描述:
 * 入口
 *
 * @author chongguanpeng
 * @create 2019-10-18 00:05
 */
public class Main {

    public static void main0(String[] args) {
        Receiver receiver = new Receiver();
        Command cmd = new ConcreteCommand(receiver);
        cmd.execute();
        cmd.undo();
    }

    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        Command cmd = new ConcreteCommand(receiver);
        Invoker invoker = new Invoker(cmd);
        invoker.execute();
        invoker.cancel();
    }


}
