package com.Besharp.java.javalessons.generics;

/**
 * Created by Hmayak Atayan on 13, July, 2021
 **/
public class Gen<T> {
    T obj;

    Gen(T obj) {
        this.obj = obj;
    }

    public T getObj() {
        return obj;
    }

    void showType() {
        System.out.println("type = " + obj.getClass().getName());
    }
}
