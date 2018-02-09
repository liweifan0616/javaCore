/**
 * LY.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.lwf.javaCore.spi;

/**
 * @author liweifan
 * @version $Id: DemoServiceImpl, v 0.1 2018/2/8 下午5:39 liweifan Exp $
 */
public class DemoServiceImpl implements DemoService {
    @Override
    public void sayHello() {
        System.out.println("hello SPI...");
    }
}