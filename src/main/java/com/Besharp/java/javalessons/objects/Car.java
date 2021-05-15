package com.Besharp.java.javalessons.objects;

/**
 * Created by Hmayak on 11, May, 2021.
 */
public class Car {
    public int maxSpeed;
    public String brandName;
    public boolean isFull;
    public int horsePower;
    static int numberOfWindows = 4;

    //object state;
    //object behaviour;
    // .
    // constructor
    // new
    // static, static methods and non static in it metadata
    // static block
    // final

    int speed = 280;

    void doAction(Car car) { // final
        car = new Car();
        car.speed = 400;

    }

    public void print(String brandName, boolean isFull, int horsePower) {
        System.out.println("brandName = " + brandName);
        System.out.println("isFull = " + isFull);
        System.out.println("horsePower = " + horsePower);
    }

    static {
        System.out.println("es static blocknem");
    }

    public void voice() {
        System.out.println("brrr");
    }
}
