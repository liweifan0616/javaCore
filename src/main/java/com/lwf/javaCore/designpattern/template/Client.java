/**
 * LY.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.lwf.javaCore.designpattern.template;

/**
 * @author liweifan
 * @version $Id: Client, v 0.1 2018/3/26 上午10:53 liweifan Exp $
 */
public abstract class Client {

    public void templateMethod() {
        before();
        appetite();
        after();
    }
    protected void before() {};

    public abstract void appetite();

    private void after() {
        System.out.println("拿筷子，找桌子，开吃...");
    }

}