/**
 * LY.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.lwf.javaCore.designpattern.mediator;

/**
 * @author liweifan
 * @version $Id: Landlord, v 0.1 2018/3/22 上午11:31 liweifan Exp $
 */
public class Landlord extends Person {

    public Landlord(Mediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    protected void sendMessage(String msg) {
        mediator.operation(this, msg);
    }

    @Override
    protected void getMessage(String msg) {
        System.out.println("房东["+ name +"]收到中介发来的消息：" + msg);
    }
}