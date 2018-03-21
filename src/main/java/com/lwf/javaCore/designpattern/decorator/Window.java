/**
 * LY.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.lwf.javaCore.designpattern.decorator;

/**
 * @author liweifan
 * @version $Id: Window, v 0.1 2018/3/21 下午3:45 liweifan Exp $
 */
public class Window extends Component {
    @Override
    public void display() {
        System.out.println("显示窗体！");
    }
}