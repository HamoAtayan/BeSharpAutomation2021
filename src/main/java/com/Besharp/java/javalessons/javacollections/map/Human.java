package com.Besharp.java.javalessons.javacollections.map;

/**
 * Created by Hmayak Atayan on 27, July, 2021
 **/
public class Human {

    private String name;
    private int age;
    private int experiance;

    public Human(String name, int age, int experiance) {
        this.name = name;
        this.age = age;
        this.experiance = experiance;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getExperiance() {
        return experiance;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", experiance=" + experiance +
                '}';
    }
}
