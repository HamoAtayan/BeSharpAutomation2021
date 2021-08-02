package com.Besharp.java.javalessons.javacollections.set;

/**
 * Created by Hmayak Atayan on 20, July, 2021
 **/
public class Vasya {

    private String name;
    private int age;

    public Vasya(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Vasya{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
