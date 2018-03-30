/**
 * LY.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.lwf.javaCore.designpattern.builder;

/**
 * @author liweifan
 * @version $Id: Builder, v 0.1 2018/3/30 下午4:29 liweifan Exp $
 */
public abstract class Builder {
    protected Product product = new Product();

    public abstract void buildPartA();
    public abstract void buildPartB();
    public abstract void buildPartC();

    public Product getProduct() {
        return product;
    }
}