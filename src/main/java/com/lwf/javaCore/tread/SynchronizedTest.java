/**
 * LY.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.lwf.javaCore.tread;

/**
 * @author liweifan
 * @version $Id: SynchronizedTest, v 0.1 2018/2/8 上午10:28 liweifan Exp $
 */
public class SynchronizedTest implements Runnable {
    @Override
    public void run() {
        synchronized (this) {
            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getName() + " synchronized loop " + i);
            }
        }
    }

    public static void main(String[] args) {
        SynchronizedTest t1 = new SynchronizedTest();
        Thread ta = new Thread(t1, "A");
        Thread tb = new Thread(t1, "B");
        ta.start();
        tb.start();
    }
}