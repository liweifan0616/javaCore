/**
 * LY.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.lwf.javaCore.annotation;

import java.lang.reflect.Field;

/**
 * @author liweifan
 * @version $Id: AnnotationProcessor, v 0.1 2018/2/24 下午5:53 liweifan Exp $
 */
public class AnnotationProcessor {
    public static void getStudentInfo(Class<?> clazz){
        if(clazz.isAnnotationPresent(Person.class)){
            Person annotation = (Person)clazz.getAnnotation(Person.class);
            System.out.println(annotation);
            System.out.println(annotation.age());
            System.out.println(annotation.name());
            String[] hobby = annotation.hobby();
            for(String str : hobby){
                System.out.println(str);
            }
        }
        Field[] fields = clazz.getDeclaredFields();

        for(Field field :fields){
            System.out.println("fieldName=" + field.toString());
            if(field.isAnnotationPresent(StudentGender.class)){
                StudentGender annotation = (StudentGender)field.getAnnotation(StudentGender.class);
                System.out.println(annotation);
                System.out.println(annotation.gender());
            }
        }
    }
}