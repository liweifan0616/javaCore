/**
 * LY.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.lwf.javaCore.designpattern.decorator;

/**
 * @author liweifan
 * @version $Id: Client, v 0.1 2018/3/21 下午3:49 liweifan Exp $
 */
public class Client {
    public static void main(String[] args) {

        Component component,componentSB;  //使用抽象构件定义
        component = new Window(); //定义具体构件
        componentSB = new  ScrollBarDecorator(component); //定义装饰后的构件
        componentSB.display();
//        component.display();
    }
}