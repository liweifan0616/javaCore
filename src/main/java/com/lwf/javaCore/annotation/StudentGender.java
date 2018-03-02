package com.lwf.javaCore.annotation;

public @interface StudentGender {
    public enum Gender{BOY, GIRL};
    Gender gender() default Gender.BOY;
}
