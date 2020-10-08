package com.ranger.behavioral.command;

/**
 * 描述:
 * 命令模式或者事务模式
 *
 * @author chongguanpeng
 * @create 2019-10-18 00:00
 */
public interface Command {

    void execute();

    void undo();
}
