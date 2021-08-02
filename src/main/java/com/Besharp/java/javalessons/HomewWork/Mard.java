package com.Besharp.java.javalessons.HomewWork;

/**
 * Created by Hmayak Atayan on 27, July, 2021
 **/
public class Mard {
    int age;
    String name;

    public Mard(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Mard{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
