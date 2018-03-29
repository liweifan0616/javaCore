/**
 * LY.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.lwf.javaCore.designpattern.template;

/**
 * @author liweifan
 * @version $Id: Test1, v 0.1 2018/3/26 上午10:59 liweifan Exp $
 */
public class Test1 {
    public static void main(String[] args) {
        Restaurant waiter = new Restaurant();
        waiter.dozenRice(new Client() {
            @Override
            protected void before() {
                System.out.println("对服务员吹胡子瞪眼！！");
            }

            @Override
            public void appetite() {
                System.out.println("盛了一锅米饭");
            }
        });
    }

}