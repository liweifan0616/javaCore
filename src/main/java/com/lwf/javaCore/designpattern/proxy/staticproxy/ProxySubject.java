/**
 * LY.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.lwf.javaCore.designpattern.proxy.staticproxy;

/**
 * @author liweifan
 * @version $Id: ProxySubject, v 0.1 2018/4/19 下午7:32 liweifan Exp $
 */
public class ProxySubject implements Subject {

    // 维持对真实委托对象的引用，该对象才是真正的执行者
    private Subject realSubject;

    public ProxySubject(Subject realSubject) {
        this.realSubject = realSubject;
    }

    @Override
    public void visit() {
        // 真实委托对象 通过 代理对象的引用 间接的实现了对目标对象的访问执行
        realSubject.visit();
    }
}