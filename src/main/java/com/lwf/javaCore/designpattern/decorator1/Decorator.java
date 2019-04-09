/**
 * LY.com Inc.
 * Copyright (c) 2004-2019 All Rights Reserved.
 */
package com.lwf.javaCore.designpattern.decorator1;

/**
 * @author liweifan
 * @version $Id: Decorator, v 0.1 2019-04-08 20:01 liweifan Exp $
 */
public abstract class Decorator implements Beverage {

    private Beverage beverage;

    public Decorator(Beverage be) {
        this.beverage = be;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription();
    }

    @Override
    public double getPrice() {
        return beverage.getPrice();
    }
}