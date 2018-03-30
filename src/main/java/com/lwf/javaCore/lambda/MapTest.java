/**
 * LY.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.lwf.javaCore.lambda;

import java.util.Arrays;
import java.util.List;

/**
 * @author liweifan
 * @version $Id: MapTest, v 0.1 2018/3/30 下午3:43 liweifan Exp $
 */
public class MapTest {
    public static void main(String[] args) {
        List<Double> costBeforeTax = Arrays.asList(100d, 200d, 300d, 400d, 500d);
        costBeforeTax.stream().map((cost) -> cost + .12*cost).forEach(System.out::println);
        double bill = costBeforeTax.stream().map((cost) -> cost + .12*cost).reduce((sum, cost) -> sum + cost).get();
        System.out.println(bill);
    }
}