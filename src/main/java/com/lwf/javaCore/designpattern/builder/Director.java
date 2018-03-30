/**
 * LY.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.lwf.javaCore.designpattern.builder;

/**
 * @author liweifan
 * @version $Id: Director, v 0.1 2018/3/30 下午4:32 liweifan Exp $
 */
public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public Product construct(){
        System.out.println("--- 指挥者开始 构建产品 ---");
        builder.buildPartA();
        builder.buildPartB();
        builder.buildPartC();
        System.out.println("--- 指挥者 构建产品 完成 ---");
        return builder.getProduct();
    }
}