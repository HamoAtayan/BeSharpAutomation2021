package com.Besharp.java.javalessons.javacollections.set;

import java.util.Comparator;

/**
 * Created by Hmayak Atayan on 20, July, 2021
 **/
public class Human implements Comparable<Human> {

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

    public Human(int age, String name, String lastName, int workExperiance) {
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

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Human{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", workExperiance=" + workExperiance +
                '}';
    }

    @Override
    public int compareTo(Human o) {
        if (getAge() < o.getAge()) {
            return 1;
        } else if (getAge() > o.getAge()) {
            return -1;
        } else {
            return 0;
        }
    }

    public void printHuman(Human human){
        //Human aaa = human
        System.out.println(human);
    }

    public void tpiTiv(int tiv){
        //arjheq =  tiv
        System.out.println(tiv);
    }
}
