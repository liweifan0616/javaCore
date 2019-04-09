/**
 * LY.com Inc.
 * Copyright (c) 2004-2019 All Rights Reserved.
 */
package com.lwf.javaCore.designpattern.factorymethod;

/**
 * @author liweifan
 * @version $Id: Factory, v 0.1 2019-04-03 16:41 liweifan Exp $
 */
public interface Factory {
    /**
     * 创建具体产品
     * @return
     */
    public Product createProduct();
}