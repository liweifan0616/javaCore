/**
 * LY.com Inc.
 * Copyright (c) 2004-2017 All Rights Reserved.
 */
package com.lwf.javaCore.steam;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

/**
 * @author liweifan
 * @version $Id: Stream, v 0.1 2017/12/22 上午9:48 liweifan Exp $
 */
public class Stream {

    public void forEach() {
        Random random = new Random();
        random.ints().limit(10).forEach(System.out::println);
    }

    public void filter() {
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");
        // 获取空字符串的数量
        int count = (int) strings.stream().filter(string -> string.isEmpty()).count();
        System.out.println(count);
    }

    public void map() {
        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
        // 获取对应的平方数
        List<Integer> squaresList = numbers.stream().map( i -> i*i).collect(Collectors.toList());
        System.out.println(squaresList);
    }
}