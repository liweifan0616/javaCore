/**
 * LY.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.lwf.javaCore.annotation;

import com.alibaba.fastjson.JSON;

/**
 * @author liweifan
 * @version $Id: Test, v 0.1 2018/2/24 下午5:44 liweifan Exp $
 */
public class Test {
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println(JSON.toJSONString(s1));
    }
}