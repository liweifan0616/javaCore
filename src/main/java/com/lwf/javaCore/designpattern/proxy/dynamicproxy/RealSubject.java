/**
 * LY.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.lwf.javaCore.designpattern.proxy.dynamicproxy;

/**
 * @author liweifan
 * @version $Id: RealSubject, v 0.1 2018/4/19 下午7:40 liweifan Exp $
 */
public class RealSubject implements Subject {
    @Override
    public void visit() {
        System.out.println("I am 'RealSubject',I am the execution method");
    }
}