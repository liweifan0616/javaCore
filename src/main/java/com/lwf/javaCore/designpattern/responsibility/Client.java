/**
 * LY.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.lwf.javaCore.designpattern.responsibility;

/**
 * @author liweifan
 * @version $Id: Client, v 0.1 2018/3/22 上午10:58 liweifan Exp $
 */
public class Client {
    public static void main(String[] args) {

        Handler handlerA,handlerB,handlerC;
        handlerA = new ConcreteHandlerA();
        handlerB = new ConcreteHandlerB();
        handlerC = new ConcreteHandlerC();

        // 创建职责链  handlerA ——> handlerB ——> handlerC
        handlerA.setNextHandler(handlerB);
        handlerB.setNextHandler(handlerC);

        // 发送请假请求一
//        handlerA.handleRequest(1);

        // 发送请假请求二
        handlerA.handleRequest(7);

        // 发送请假请求二
//        handlerA.handleRequest(3);
    }
}