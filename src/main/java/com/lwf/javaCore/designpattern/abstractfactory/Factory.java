/**
 * LY.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.lwf.javaCore.designpattern.abstractfactory;

/**
 * @author liweifan
 * @version $Id: Factory, v 0.1 2018/3/21 下午4:33 liweifan Exp $
 */
public interface Factory {
    public ProductA createProductA();

    public ProductB createProductB();
}