/**
 * LY.com Inc.
 * Copyright (c) 2004-2019 All Rights Reserved.
 */
package com.lwf.javaCore.designpattern.factorymethod;

/**
 * @author liweifan
 * @version $Id: ProductFactoryB, v 0.1 2019-04-03 16:44 liweifan Exp $
 */
public class ProductFactoryB implements Factory {
    @Override
    public Product createProduct() {
        return new ConcreteProductB();
    }
}