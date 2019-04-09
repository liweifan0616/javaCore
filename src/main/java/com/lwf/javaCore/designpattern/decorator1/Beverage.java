/**
 * LY.com Inc.
 * Copyright (c) 2004-2019 All Rights Reserved.
 */
package com.lwf.javaCore.designpattern.decorator1;

/**
 * 饮料接口
 * @author liweifan
 * @version $Id: Beverage, v 0.1 2019-04-08 19:57 liweifan Exp $
 */
public interface Beverage {
    /** 返回饮料描述 */
    public String getDescription();

    /** 返回价格 */
    public double getPrice();
}