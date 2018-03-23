/**
 * LY.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.lwf.javaCore.designpattern.responsibility;

/**
 * @author liweifan
 * @version $Id: ConcreteHandlerC, v 0.1 2018/3/22 上午10:58 liweifan Exp $
 */
public class ConcreteHandlerC extends Handler {
    @Override
    public void handleRequest(int leaveDay) {
        if(leaveDay > 5){
            System.out.println("当请假天数大于5天的情况下 由总经理亲自操刀审批。总经理的职责已经是最大的啦，还有他没有权限处理的事吗？");
        }
    }
}