/**
 * LY.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.lwf.javaCore.exception;

/**
 * @author liweifan
 * @version $Id: TestThrow, v 0.1 2018/2/1 下午2:31 liweifan Exp $
 */
public class TestThrow {
    static void proc() {
        try {
            throw new NullPointerException("demo");
        } catch (NullPointerException e) {
            System.out.println("Caught inside proc");
            throw e;
        }
    }

    public static void main(String[] args) {
        try {
            proc();
        } catch (NullPointerException e) {
            System.out.println("Recaught: "+e);
        }
    }
}