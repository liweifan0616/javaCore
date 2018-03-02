/**
 * LY.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.lwf.javaCore.tread.atomic;

import java.util.concurrent.CountDownLatch;

/**
 * @author liweifan
 * @version $Id: UnSafeAdd, v 0.1 2018/3/2 上午11:19 liweifan Exp $
 */
public class UnSafeAdd {
    private static int threadCount = 10;
    private static CountDownLatch countDown = new CountDownLatch(threadCount);
    private static int count = 0;

    private static class Counter implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < 1000; i++) {
                count++;//非原子操作
            }
            countDown.countDown();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread[] threads = new Thread[threadCount];
        for (int i = 0; i < threadCount; i++) {
            threads[i] = new Thread(new Counter());
        }
        for (int i = 0; i < threadCount; i++) {
            threads[i].start();
        }
        countDown.await();
        System.out.println(count);
    }
}