/**
 * LY.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.lwf.javaCore.designpattern.memento;

/**
 * @author liweifan
 * @version $Id: Memento, v 0.1 2018/4/2 上午9:49 liweifan Exp $
 */
public class Memento {
    private String state;

    public Memento(Originator originator) {
        this.state = originator.getState();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}