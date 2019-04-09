/**
 * LY.com Inc.
 * Copyright (c) 2004-2019 All Rights Reserved.
 */
package com.lwf.javaCore.designpattern.decorator1;

/**
 * @author liweifan
 * @version $Id: Milk, v 0.1 2019-04-08 20:02 liweifan Exp $
 */
public class Milk extends Decorator {
    private String description = "加了牛奶！";

    public Milk(Beverage beverage) {
        super(beverage);
    }

    public String getDescription() {
        return super.getDescription()+"\n"+description;
    }

    public double getPrice() {
        return super.getPrice() + 20; //20表示牛奶的价格
    }
}