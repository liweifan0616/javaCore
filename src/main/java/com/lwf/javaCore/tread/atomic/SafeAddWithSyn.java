/**
 * LY.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.lwf.javaCore.tread.atomic;

import java.util.concurrent.CountDownLatch;

/**
 * @author liweifan
 * @version $Id: SafeAddWithSyn, v 0.1 2018/3/2 上午11:23 liweifan Exp $
 */
public class SafeAddWithSyn {
    private static int threadCount = 10;
    private static CountDownLatch countDown = new CountDownLatch(threadCount);
    private static int count = 0;

    synchronized private static void addCount() {  // 同步方法
        count++;
    }

    private static class Counter implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < 1000; i++) {
                addCount();
            }
            countDown.countDown();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread[] threads = new Thread[threadCount];
        for (int i = 0; i < threadCount; i++) {
            threads[i] = new Thread(new SafeAddWithSyn.Counter());
        }
        for (int i = 0; i < threadCount; i++) {
            threads[i].start();
            ;
        }
        countDown.await();
        System.out.println(count);
    }
}