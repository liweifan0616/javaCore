/**
 * LY.com Inc.
 * Copyright (c) 2004-2019 All Rights Reserved.
 */
package com.lwf.javaCore.designpattern.decorator1;

/**
 * @author liweifan
 * @version $Id: Mocha, v 0.1 2019-04-08 20:03 liweifan Exp $
 */
public class Mocha extends Decorator {
    private String description = "加了摩卡！";

    public Mocha(Beverage beverage) {
        super(beverage);
    }

    public String getDescription() {
        return super.getDescription()+"\n"+description;
    }

    public double getPrice() {
        return super.getPrice() + 49; //49表示摩卡的价格
    }
}