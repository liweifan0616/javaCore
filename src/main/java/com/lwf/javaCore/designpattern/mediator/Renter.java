/**
 * LY.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.lwf.javaCore.designpattern.mediator;

/**
 * 具体同事类 租房者
 * @author liweifan
 * @version $Id: Renter, v 0.1 2018/3/22 上午11:29 liweifan Exp $
 */
public class Renter extends Person {
    public Renter(Mediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    protected void sendMessage(String msg) {
        mediator.operation(this, msg);
    }

    @Override
    protected void getMessage(String msg) {
        System.out.println("求租者[" + name + "]收到中介发来的消息： " + msg);
    }
}