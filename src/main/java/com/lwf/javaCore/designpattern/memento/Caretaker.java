/**
 * LY.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.lwf.javaCore.designpattern.memento;

/**
 * @author liweifan
 * @version $Id: Caretaker, v 0.1 2018/4/2 上午9:59 liweifan Exp $
 */
public class Caretaker {
    public Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}