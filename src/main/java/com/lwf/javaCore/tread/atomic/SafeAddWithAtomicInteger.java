/**
 * LY.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.lwf.javaCore.tread.atomic;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author liweifan
 * @version $Id: SafeAddWithAtomicInteger, v 0.1 2018/3/2 上午11:25 liweifan Exp $
 */
public class SafeAddWithAtomicInteger {
    private static int threadCount = 10;
    private static CountDownLatch countDown = new CountDownLatch(threadCount);
    private static AtomicInteger count = new AtomicInteger(0);

    private static class Counter implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < 1000; i++) {
                count.addAndGet(1);
            }
            countDown.countDown();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread[] threads = new Thread[threadCount];
        for (int i = 0; i < threadCount; i++) {
            threads[i] = new Thread(new SafeAddWithAtomicInteger.Counter());
        }
        for (int i = 0; i < threadCount; i++) {
            threads[i].start();
            ;
        }
        countDown.await();
        System.out.println(count);
    }
}