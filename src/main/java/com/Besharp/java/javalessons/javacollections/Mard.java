package com.Besharp.java.javalessons.javacollections;

import java.util.Comparator;

/**
 * Created by Hmayak Atayan on 17, July, 2021
 **/
public class Mard implements Comparator<Mard> {
    private int age;
    private String name;
    private String lastName;
    private int workExperiance;

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getWorkExperiance() {
        return workExperiance;
    }

    public void setWorkExperiance(int workExperiance) {
        this.workExperiance = workExperiance;
    }

    public Mard(int age, String name, String lastName, int workExperiance) {
        this.age = age;
        this.name = name;
        this.lastName = lastName;
        this.workExperiance = workExperiance;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Mard(int age, String name) {
        this.age = age;
        this.name = name;
    }


    @Override
    public int compare(Mard o1, Mard o2) {
        if (o1.getAge() < o2.getAge()) {
            return 1;
        } else if (o1.getAge() > o2.getAge()) {
            return -1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "Mard{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", workExperiance=" + workExperiance +
                '}';
    }
}
