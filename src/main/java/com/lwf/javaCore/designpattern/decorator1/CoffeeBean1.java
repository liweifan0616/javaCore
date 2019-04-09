/**
 * LY.com Inc.
 * Copyright (c) 2004-2019 All Rights Reserved.
 */
package com.lwf.javaCore.designpattern.decorator1;

/**
 * @author liweifan
 * @version $Id: CoffeeBean1, v 0.1 2019-04-08 19:59 liweifan Exp $
 */
public class CoffeeBean1 implements Beverage {

    private String description = "选了第一种咖啡豆";

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public double getPrice() {
        return 50;
    }
}