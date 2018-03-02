package com.lwf.javaCore.annotation;

public @interface Person {

    String name() default "zcx";
    int age() default 18;

    String[] hobby() default {"basketball", "football"};
}
