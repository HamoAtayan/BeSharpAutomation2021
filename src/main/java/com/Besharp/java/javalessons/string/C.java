package com.Besharp.java.javalessons.string;

/**
 * Created by Hmayak Atayan on 10, July, 2021
 **/
public class C implements A, B {

    @Override
    public  void test() {
        B.super.test();
    }

    public static void main(String[] args) {
        C c = new C();
        c.test();
    }
}
