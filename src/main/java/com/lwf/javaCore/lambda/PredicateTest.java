/**
 * LY.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.lwf.javaCore.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * @author liweifan
 * @version $Id: Predicate, v 0.1 2018/3/30 下午3:22 liweifan Exp $
 */
public class PredicateTest {
    public static void main(String[] args) {
        List<String> languages = Arrays.asList("Java", "Scala", "C++", "Haskell", "Lisp", "JJ");
        Predicate<String> startWithJ = (n) -> n.startsWith("J");
        Predicate<String> fourLetterLong = (n) -> n.length() == 4;
        languages.stream().filter(startWithJ.and(fourLetterLong))
                .forEach((n) -> System.out.print("nName, which starts with 'J' and four letter long is : " + n));
    }
}