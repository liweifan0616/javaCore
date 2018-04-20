/**
 * LY.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.lwf.javaCore.designpattern.proxy.cglib;

/**
 * @author liweifan
 * @version $Id: CglibRealSubject, v 0.1 2018/4/20 上午10:06 liweifan Exp $
 */
public class CglibRealSubject {
    public void visit() {
        System.out.println("I am 'RealSubject',I am the execution method");
    }
}