package com.Besharp.java.javalessons.oop;

/**
 * Created by Hmayak Atayan on 26, June, 2021
 **/
public class Car1Test {
    public static void main(String[] args) {
        Car1 bmw = new Car1();
        bmw.setName("bmw")
                .setSpeed(250)
                .setNumberOfWheel(4);

                Car1 mers = new Car1();
                mers.setName("mers")
                        .setSpeed(220)
                        .setNumberOfWheel(4);

        System.out.println(bmw);
        System.out.println(mers);
    }
}
