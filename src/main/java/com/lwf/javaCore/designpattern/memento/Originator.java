/**
 * LY.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.lwf.javaCore.designpattern.memento;

/**
 * @author liweifan
 * @version $Id: Originator, v 0.1 2018/4/2 上午9:48 liweifan Exp $
 */
public class Originator {
    private String state;

    public Memento createMemento(){
        return new Memento(this);
    }

    public void restoreMemento(Memento o) {
        this.state = o.getState();
    }


    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}