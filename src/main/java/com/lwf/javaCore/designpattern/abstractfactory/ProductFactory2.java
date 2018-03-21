/**
 * LY.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.lwf.javaCore.designpattern.abstractfactory;

/**
 * @author liweifan
 * @version $Id: ProductFactory2, v 0.1 2018/3/21 下午4:35 liweifan Exp $
 */
public class ProductFactory2 implements Factory {
    @Override
    public ProductA createProductA() {
        return new ConcreteProductA2();
    }

    @Override
    public ProductB createProductB() {
        return new ConcreteProductB2();
    }
}