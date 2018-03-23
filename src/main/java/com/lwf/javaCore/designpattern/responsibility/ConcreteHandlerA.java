/**
 * LY.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.lwf.javaCore.designpattern.responsibility;

/**
 * @author liweifan
 * @version $Id: ConcreteHandlerA, v 0.1 2018/3/22 上午10:54 liweifan Exp $
 */
public class ConcreteHandlerA extends Handler {
    @Override
    public void handleRequest(int leaveDay) {
        if(leaveDay <= 1){
            // 满足处理条件  处理请求
            System.out.println("请假天数小于2天  由部门组长审批");
        } else {
            nextHandler.handleRequest(leaveDay);
        }
    }
}