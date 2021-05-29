package com.Besharp.java.javalessons.objects;

/**
 * Created by Hmayak on 18, May, 2021.
 */
public class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
    }

    public Person(int age, String name) {
        System.out.println(age);
        System.out.println(name);
    }

    void walk(String inchpes) {
        System.out.println(inchpes);
    }
}
