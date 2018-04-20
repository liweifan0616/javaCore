/**
 * LY.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.lwf.javaCore.designpattern.memento;

/**
 * @author liweifan
 * @version $Id: Client, v 0.1 2018/4/2 上午9:59 liweifan Exp $
 */
public class Client {
    public static void main(String[] args) {
        Caretaker caretaker = new Caretaker();
        Originator originator = new Originator();
        // 初始化状态标识 "0"
        originator.setState("0");
        // 创建状态为"0"的备忘录对象
        Memento memento_1 = originator.createMemento();
        // 将记录了Originator状态的备忘录 交给 Caretaker备忘录管理者储存
        caretaker.setMemento(memento_1);
        showState(originator);

        System.out.println("----- 更改原发器的状态 -----");
        // 更改原发器的状态标识为"1"
        originator.setState("1");
        showState(originator);

        System.out.println("----- 撤销至原发器的先前状态 -----");
        originator.restoreMemento(caretaker.getMemento());
        showState(originator);
    }

    private static void showState(Originator originator) {
        System.out.println("Originator 的当前状态：" + originator.getState());
    }
}