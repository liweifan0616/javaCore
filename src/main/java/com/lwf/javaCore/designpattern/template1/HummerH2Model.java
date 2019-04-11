/**
 * LY.com Inc.
 * Copyright (c) 2004-2019 All Rights Reserved.
 */
package com.lwf.javaCore.designpattern.template1;

/**
 * @author liweifan
 * @version $Id: HummerH2Model, v 0.1 2019-04-11 16:29 liweifan Exp $
 */
public class HummerH2Model extends HummerModel {
    @Override
    public void alarm() {
        System.out.println("悍马H2鸣笛...");
    }

    @Override
    public void engineBoom() {
        System.out.println("悍马H2引擎声音是这样的...");
    }

    @Override
    public void start() {
        System.out.println("悍马H2发动...");
    }

    @Override
    public void stop() {
        System.out.println("悍马H2停车...");
    }

    @Override
    protected boolean isAlarm() {
        return false;
    }
}