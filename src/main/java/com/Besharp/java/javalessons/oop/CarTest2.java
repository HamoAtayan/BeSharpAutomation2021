package com.Besharp.java.javalessons.oop;

/**
 * Created by Hmayak on 25, May, 2021.
 */
public class CarTest2 {
    public static void main(String[] args) {
        System.out.println(Car.staticTiv);
        ++Car.staticTiv;
        System.out.println(Car.staticTiv);
        Car aaa = new Car("aaa");
        System.out.println(Car.staticTiv);
    }
}
