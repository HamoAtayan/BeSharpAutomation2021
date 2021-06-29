package com.Besharp.java.javalessons.anno;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by Hmayak Atayan on 29, June, 2021
 **/
@Retention(RetentionPolicy.RUNTIME) // class , runtime, source
@Target({ElementType.METHOD,ElementType.FIELD})
public @interface MyAnno {

    String name();
}
