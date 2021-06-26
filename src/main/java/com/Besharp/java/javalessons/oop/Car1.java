package com.Besharp.java.javalessons.oop;

/**
 * Created by Hmayak Atayan on 26, June, 2021
 **/
public class Car1 {
    int speed;
    String name;
    int numberOfWheel;

    public int getSpeed() {
        return speed;
    }

    public Car1 setSpeed(int speed) {
        this.speed = speed;
        return this;
    }

    public String getName() {
        return name;
    }

    public Car1 setName(String name) {
        this.name = name;
        return this;
    }

    public int getNumberOfWheel() {
        return numberOfWheel;
    }

  String   print(){
        System.out.println("hello");
        return "asd";
    }

    public Car1 setNumberOfWheel(int numberOfWheel) {
        this.numberOfWheel = numberOfWheel;
        return this;
    }

    @Override
    public String toString() {
        return "Car1{" +
                "speed=" + speed +
                ", name='" + name + '\'' +
                ", numberOfWheel=" + numberOfWheel +
                '}';
    }
}
