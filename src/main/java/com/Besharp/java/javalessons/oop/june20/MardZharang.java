package com.Besharp.java.javalessons.oop.june20;

/**
 * Created by Hmayak Atayan on 20, June, 2021
 **/
public class MardZharang extends Mard {

    MardZharang(String name, String lastName, int age) {
        super(name, lastName, age);
        super.age = age;
    }
}
