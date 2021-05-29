package com.Besharp.java.javalessons.oop;

/**
 * Created by Hmayak on 25, May, 2021.
 */
public class CarTest {
    public static void main(String[] args) {
        Car bmw = new Car("bmw");
        Car mers = new Car("mers");
        Car mazda = new Car("mazda");
        Car toyota = new Car("toyota");

        System.out.println(bmw.name.equals(mers.name));

        System.out.println(Car.staticTiv);

    }
}
