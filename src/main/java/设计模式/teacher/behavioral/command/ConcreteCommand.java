package com.ranger.behavioral.command;

/**
 * 描述:
 * 实际的执行命令
 *
 * @author chongguanpeng
 * @create 2019-10-18 00:02
 */
public class ConcreteCommand implements Command {

    private Receiver receiver;

    public ConcreteCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.doAction();
    }

    @Override
    public void undo() {
        receiver.undoAction();
    }
}
