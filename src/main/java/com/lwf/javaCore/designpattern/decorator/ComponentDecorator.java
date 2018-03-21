/**
 * LY.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.lwf.javaCore.designpattern.decorator;

/**
 * @author liweifan
 * @version $Id: ComponentDecorator, v 0.1 2018/3/21 下午3:45 liweifan Exp $
 */
public class ComponentDecorator extends Component {

    private Component component;

    public ComponentDecorator(Component component) {
        this.component = component;
    }

    @Override
    public void display() {
        component.display();
    }
}