/**
 * LY.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.lwf.javaCore.designpattern.proxy.staticproxy;

/**
 * @author liweifan
 * @version $Id: Client, v 0.1 2018/4/19 下午7:33 liweifan Exp $
 */
public class Client {
    public static void main(String[] args) {
        Subject proxySubject = new ProxySubject(new RealSubject());
        proxySubject.visit();
    }
}