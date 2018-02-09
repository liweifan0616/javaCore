/**
 * LY.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.lwf.javaCore.spi;

import java.util.ServiceLoader;

/**
 * @author liweifan
 * @version $Id: DemoServiceTest, v 0.1 2018/2/8 下午5:44 liweifan Exp $
 */
public class DemoServiceTest {
    public static void main(String[] args) {
        ServiceLoader<DemoService> services = ServiceLoader.load(DemoService.class);
        for (DemoService service : services) {
            service.sayHello();
        }
    }
}