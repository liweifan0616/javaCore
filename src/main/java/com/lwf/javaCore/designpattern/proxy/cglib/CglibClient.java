/**
 * LY.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.lwf.javaCore.designpattern.proxy.cglib;

/**
 * @author liweifan
 * @version $Id: CglibClient, v 0.1 2018/4/20 上午10:46 liweifan Exp $
 */
public class CglibClient {
    public static void main(String[] args) {
        CglibDynamicProxy cglib = new CglibDynamicProxy();
        CglibRealSubject realSubject = (CglibRealSubject) cglib.getProxyInstance(new CglibRealSubject());
        realSubject.visit();
    }
}