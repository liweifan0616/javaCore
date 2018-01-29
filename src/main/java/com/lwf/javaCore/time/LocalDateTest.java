/**
 * LY.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.lwf.javaCore.time;

import java.time.LocalDate;

/**
 * @author liweifan
 * @version $Id: LocalDateTest, v 0.1 2018/1/8 上午10:39 liweifan Exp $
 */
public class LocalDateTest {

    public static void test() {
        LocalDate today = LocalDate.now();
        System.out.println("Today's Local date : " + today);
    }

    public static void main(String[] args) {
        test();
    }
}