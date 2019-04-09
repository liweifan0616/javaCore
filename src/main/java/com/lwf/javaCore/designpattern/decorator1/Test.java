/**
 * LY.com Inc.
 * Copyright (c) 2004-2019 All Rights Reserved.
 */
package com.lwf.javaCore.designpattern.decorator1;

/**
 * @author liweifan
 * @version $Id: Test, v 0.1 2019-04-08 20:02 liweifan Exp $
 */
public class Test {
    public static void main(String[] args) {
        Beverage beverage = new CoffeeBean2();	//选择了第一种咖啡豆磨制的咖啡
        beverage = new Mocha(beverage);		//为咖啡加了摩卡
        beverage = new Milk(beverage);
        System.out.println(beverage.getDescription()+"\n加了摩卡和牛奶的咖啡价格："+beverage.getPrice());
    }
}