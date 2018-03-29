/**
 * LY.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.lwf.javaCore.designpattern.command;

/**
 * @author liweifan
 * @version $Id: Client, v 0.1 2018/3/27 下午2:54 liweifan Exp $
 */
public class Client {
    public static void main(String[] args) {
        Command command = null;
        /*
         * 如果要使命令发送给 命令接收者B（ReceiverB）处理
         * 则只要实例化与ReceiverB 相关的命令类ConcreteCommandB即可
         * 代码修改如下：
         * command = new ConcreteCommandB();
         *
         * 以下是实例化命令类ConcreteCommandA 及将命令消息发送给与之关联的ReceiverA处理
         */
        command = new ConcreteCommandA();
        Invoker invoker = new Invoker();
        invoker.setCommand(command);
        invoker.runCommand();
    }
}