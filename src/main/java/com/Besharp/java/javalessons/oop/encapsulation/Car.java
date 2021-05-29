package com.Besharp.java.javalessons.oop.encapsulation;

/**
 * Created by Hmayak on 25, May, 2021.
 */
public class Car {
    private int speed;
    private String name;
    private int numberOfWheels;
    private int numberOfDoors;


    public Car(int speed, int numberOfDoors) {
        this.speed = speed;
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public void setSpeed(int speed) {
        if (speed < 0 || speed > 250) {
            System.out.println("wrong speed please correct speed");
        } else {
            this.speed = speed;
            run();
        }
    }

    public int getSpeed() {
        return speed;
    }


    private void run() {
        System.out.println("running in " + speed);
    }

    public void setName(String name) {
        this.name = name;
    }


    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public int getNumberOFWheels() {
        return numberOfWheels;
    }


    private void voice() {
        System.out.println("brrrrr");
    }

    public Car(){}

    //access modifiers
    //public
    //private
    //protected
    // default / package private



}
