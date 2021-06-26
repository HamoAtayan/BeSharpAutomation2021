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
        toyota.gnal();
        toyota.gnal(10,"a");
        toyota.gnal("b",20);

        short t = 20;

        toyota.gnal(10, "10");
        toyota.gnal("100", 100);

        System.out.println(bmw.name.equals(mers.name));

        System.out.println(Car.staticTiv);

    }
}
