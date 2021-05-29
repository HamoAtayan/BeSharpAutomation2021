package com.Besharp.java.javalessons.oop.encapsulation;

/**
 * Created by Hmayak on 25, May, 2021.
 */
public class CarTest {
    public static void main(String[] args) {
        Car bmw = new Car();
        bmw.setSpeed(249);
        System.out.println(bmw.getSpeed());
        bmw.setNumberOfWheels(155);
        System.out.println(bmw.getNumberOFWheels());

        Car bmwM5F10 = new Car(350,4);
        System.out.println(bmwM5F10.getNumberOfDoors());
        System.out.println(bmwM5F10.getSpeed());


        //oop concept
        // encapsulation
        // inheritance
        // polymorphism
        // abstraction

    }
}
