/**
 * LY.com Inc.
 * Copyright (c) 2004-2019 All Rights Reserved.
 */
package com.lwf.javaCore.designpattern.factorymethod;

/**
 * @author liweifan
 * @version $Id: Client, v 0.1 2019-04-03 16:44 liweifan Exp $
 */
public class Client {
    public static void main(String[] args) {
        Factory factory = null;
        factory = new ProductFactoryA();
        Product productA = factory.createProduct();

        factory = new ProductFactoryB();
        Product productB = factory.createProduct();
    }
}