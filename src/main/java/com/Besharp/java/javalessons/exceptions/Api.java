package com.Besharp.java.javalessons.exceptions;

/**
 * Created by Hmayak Atayan on 22, June, 2021
 **/
public class Api {
    static MyException test = new MyException();

    static int sum(int a, int b) throws MyException {
        System.out.println("Sum");
        if (a > b) {
            throw test;
        }
        return a + b;
    }
}
