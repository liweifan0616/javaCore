/**
 * LY.com Inc.
 * Copyright (c) 2004-2017 All Rights Reserved.
 */


import com.lwf.javaCore.steam.Stream;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author liweifan
 * @version $Id: StreamTest, v 0.1 2017/12/21 下午8:00 liweifan Exp $
 */
public class StreamTest {

    Stream stream = new Stream();

    @Test
    public void get() {
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");
        System.out.println(strings);
        List<String> filtered = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());
        System.out.println(filtered);
    }

    @Test
    public void forEachTest() {
        stream.forEach();
    }

    @Test
    public void filterTest() {
        stream.filter();
    }

    @Test
    public void mapTest() {
        stream.map();
    }
}