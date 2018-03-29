/**
 * LY.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.lwf.javaCore.designpattern.command;

/**
 * @author liweifan
 * @version $Id: ConcreteCommandA, v 0.1 2018/3/27 下午2:51 liweifan Exp $
 */
public class ConcreteCommandA extends Command {
    private ReceiverA receiver;
    @Override
    public void execute() {
        receiver = new ReceiverA();
    }
}