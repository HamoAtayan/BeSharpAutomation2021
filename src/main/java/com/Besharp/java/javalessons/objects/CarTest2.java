package com.Besharp.java.javalessons.objects;

/**
 * Created by Hmayak on 15, May, 2021.
 */
public class CarTest2 {
    public static void main(String[] args) {
//        Car2.initStatic(10);
        System.out.println("---------------------");
        Car.numberOfWindows = 5;

        Car bmw2 = new Car();
        String tiv = new String("tiv");
        String number = "10";

        System.out.println(Car.numberOfWindows);

        Car bmw = new Car();
        bmw.speed = 380;

        Car mers = new Car();
        mers.speed = 350;

        Car toyota = new Car();
        toyota.speed = 200;

        Car volkswagen = new Car();
        volkswagen.speed = 180;

        Car mazda = new Car();
        mazda.speed = 250;
        Car[] carsArray = {bmw, mers, toyota, volkswagen, mazda};

        System.out.println(carsArray[4].speed);
    }

}
