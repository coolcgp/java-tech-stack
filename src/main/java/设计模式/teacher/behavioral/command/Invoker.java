package com.ranger.behavioral.command;

/**
 * 描述:
 * 命令的发出者
 *
 * @author chongguanpeng
 * @create 2019-10-18 00:06
 */
public class Invoker {

    private Command cmd;

    public Invoker(Command cmd) {
        this.cmd = cmd;
    }

    public void execute() {
        cmd.execute();
    }

    public void cancel() {
        cmd.undo();
    }
}
