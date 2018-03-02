/**
 * LY.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.lwf.javaCore.annotation;

/**
 * @author liweifan
 * @version $Id: Student, v 0.1 2018/2/24 下午5:42 liweifan Exp $
 */
@Person(name="haha", age=97, hobby={"test1", "test2"})
public class Student {
    @StudentGender(gender= StudentGender.Gender.BOY)
    private String stuGender;


    public String getStuGender() {
        return stuGender;
    }
    public void setStuGender(String stuGender) {
        this.stuGender = stuGender;
    }
}