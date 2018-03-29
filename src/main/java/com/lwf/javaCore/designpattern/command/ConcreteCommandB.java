/**
 * LY.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.lwf.javaCore.designpattern.command;

/**
 * @author liweifan
 * @version $Id: ConcreteCommandB, v 0.1 2018/3/27 下午2:52 liweifan Exp $
 */
public class ConcreteCommandB extends Command {
    private ReceiverB receiver;
    @Override
    public void execute() {
        receiver = new ReceiverB();
    }
}