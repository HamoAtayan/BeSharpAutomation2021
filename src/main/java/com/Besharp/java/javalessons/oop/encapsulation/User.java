package com.Besharp.java.javalessons.oop.encapsulation;

/**
 * Created by Hmayak on 25, May, 2021.
 */
public class User {
    private int age;

    public void setAge(int age) {
        if (age < 18) {
            System.out.println("age should be bigger than 18");
        } else {
         this.age = age;
        }
    }
}
