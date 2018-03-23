/**
 * LY.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.lwf.javaCore.designpattern.mediator;

/**
 * 抽象同事类
 * @author liweifan
 * @version $Id: Person, v 0.1 2018/3/22 上午11:26 liweifan Exp $
 */
public abstract class Person {
    // 维持一个抽象中介的引用
    protected Mediator mediator;
    protected String name;

    public Person(Mediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    /**
     * 设置中介对象
     * @param mediator
     */
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    /**
     * 向中介 发送消息
     */
    protected abstract void sendMessage(String msg);

    /**
     * 从中介 获取消息
     */
    protected abstract void getMessage(String msg);
}