/**
 * LY.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.lwf.javaCore.designpattern.responsibility;

/**
 * @author liweifan
 * @version $Id: ConcreteHandlerB, v 0.1 2018/3/22 上午10:56 liweifan Exp $
 */
public class ConcreteHandlerB extends Handler {
    @Override
    public void handleRequest(int leaveDay) {
        if(1 < leaveDay && leaveDay <= 5){
            // 满足处理条件  处理请求
            System.out.println("请假天数大于1天且小于等于5天  由部门经理审批");
        } else {
            nextHandler.handleRequest(leaveDay);
        }
    }
}