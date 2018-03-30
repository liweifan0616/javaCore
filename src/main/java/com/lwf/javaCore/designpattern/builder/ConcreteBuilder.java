/**
 * LY.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.lwf.javaCore.designpattern.builder;

/**
 * @author liweifan
 * @version $Id: ConcreteProduct, v 0.1 2018/3/30 下午4:30 liweifan Exp $
 */
public class ConcreteBuilder extends Builder {
    @Override
    public void buildPartA() {
        product.setPartA("build Part A");
        System.out.println("正在建造产品部件A");
    }

    @Override
    public void buildPartB() {
        product.setPartA("build Part B");
        System.out.println("正在建造产品部件B");
    }

    @Override
    public void buildPartC() {
        product.setPartA("build Part C");
        System.out.println("正在建造产品部件C");
    }
}