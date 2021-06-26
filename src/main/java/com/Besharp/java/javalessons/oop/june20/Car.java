package com.Besharp.java.javalessons.oop.june20;

/**
 * Created by Hmayak Atayan on 20, June, 2021
 **/
public class Car {
public static int numberOfWheel= 4;
    private int speed;
    private String name;

    public Car(int speed, String name) {
        this.speed = speed;
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Car{" +
                "speed=" + speed +
                ", name='" + name + '\'' +
                '}';
    }
}
