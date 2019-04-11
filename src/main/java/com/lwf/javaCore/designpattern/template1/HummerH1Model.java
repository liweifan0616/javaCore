/**
 * LY.com Inc.
 * Copyright (c) 2004-2019 All Rights Reserved.
 */
package com.lwf.javaCore.designpattern.template1;

/**
 * @author liweifan
 * @version $Id: HummerH1Model, v 0.1 2019-04-11 16:28 liweifan Exp $
 */
public class HummerH1Model extends HummerModel {
    private boolean alarmFlag = false; //是否要响喇叭
    @Override
    public void alarm() {
        System.out.println("悍马H1鸣笛...");
    }

    @Override
    public void engineBoom() {
        System.out.println("悍马H1引擎声音是这样的...");
    }

    @Override
    public void start() {
        System.out.println("悍马H1发动...");
    }

    @Override
    public void stop() {
        System.out.println("悍马H1停车...");
    }

    @Override
    protected boolean isAlarm() {
        return this.alarmFlag;
    }

    //要不要响喇叭，是有客户的来决定的
    public void setAlarm(boolean isAlarm){
        this.alarmFlag = isAlarm;
    }


}