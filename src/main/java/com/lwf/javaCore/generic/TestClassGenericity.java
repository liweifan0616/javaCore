/**
 * LY.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.lwf.javaCore.generic;

/**
 * @author liweifan
 * @version $Id: ClassGenericity, v 0.1 2018/1/29 下午4:16 liweifan Exp $
 */
public class TestClassGenericity {

    static class ClassGenericity<T> {
        T aa;

        public void test11(T bb) {
            // ...
            System.out.println(bb);
        }

        public static <A> void test12(A cc) {

            System.out.println(cc);
        }
    }

    public static void main(String[] args) {
        ClassGenericity<String> genericity = new ClassGenericity<String>();
        genericity.test11("1234");
        ClassGenericity.test12(6789);
    }
}