/**
 * LY.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.lwf.javaCore.generic;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

/**
 * 泛型方法
 *
 * @author liweifan
 * @version $Id: MethodGenericity, v 0.1 2018/1/29 下午4:41 liweifan Exp $
 */
public class MethodGenericity {

    @Test
    public void method1() {
        String arr[] = {"aaa", "bbb", "ccc", "ddd"};
        System.out.println(Arrays.toString(arr));
        exchange(arr, 0, 3);                //交换0,3位置元素
        System.out.println(Arrays.toString(arr));
    }

    @Test
    public void method2()
    {
        String[] names ={"zhangSan", "liSi","wangWu"};
        System.out.println(get(names));//输出lisi
    }

    @Test
    public void testMethod3() {
        method3(0, "fsdsdfsf");
    }

    private <K, V> void method3(K k, V v) {
        System.out.println(k.getClass().getSimpleName());
        System.out.println(v.getClass().getSimpleName());
    }

    private <T> T get(T[] ts) {
        return ts[ts.length / 2];
    }

    private static <T> void exchange(T[] arr, int i, int j) {
        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}