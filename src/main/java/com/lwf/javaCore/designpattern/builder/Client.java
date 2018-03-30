/**
 * LY.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.lwf.javaCore.designpattern.builder;

/**
 * @author liweifan
 * @version $Id: Client, v 0.1 2018/3/30 下午4:33 liweifan Exp $
 */
public class Client {
    public static void main(String[] args) {
        ConcreteBuilder cBuilder = new ConcreteBuilder();
        Director director = new Director(cBuilder);
        Product product = director.construct();
    }
}