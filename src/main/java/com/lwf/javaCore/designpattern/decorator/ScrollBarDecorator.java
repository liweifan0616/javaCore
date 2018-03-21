/**
 * LY.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.lwf.javaCore.designpattern.decorator;

/**
 * @author liweifan
 * @version $Id: ScrollBarDecorator, v 0.1 2018/3/21 下午3:47 liweifan Exp $
 */
public class ScrollBarDecorator extends ComponentDecorator {

    public ScrollBarDecorator(Component component) {
        super(component);
    }

    @Override
    public void display() {
        this.setScrollBar();
        super.display();
    }

    public void setScrollBar()

    {
        System.out.println("为构件增加滚动条！");
    }
}