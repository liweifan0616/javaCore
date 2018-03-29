/**
 * LY.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.lwf.javaCore.designpattern.command;

/**
 * @author liweifan
 * @version $Id: Invoker, v 0.1 2018/3/27 下午2:53 liweifan Exp $
 */
public class Invoker {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void runCommand(){
        command.execute();
    }
}