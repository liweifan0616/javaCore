/**
 * LY.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.lwf.javaCore.designpattern.abstractfactory;

/**
 * @author liweifan
 * @version $Id: Client, v 0.1 2018/3/21 下午4:36 liweifan Exp $
 */
public class Client {
    public static void main(String[] args) {
        Factory factory1 = null;
        System.out.println("工厂一 是正规工厂  生产的产品是正品");
        factory1 = new ProductFactory1();
        factory1.createProductA();
        factory1.createProductB();

        System.out.println("-------------");

        Factory factory2 = null;
        System.out.println("工厂二 是黑工厂  生产的产品是次品");
        factory2 = new ProductFactory2();
        factory2.createProductA();
        factory2.createProductB();
    }
}