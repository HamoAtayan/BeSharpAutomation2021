package com.Besharp.java.javalessons.objects;

/**
 * Created by Hmayak on 15, May, 2021.
 */
public class CarTest {

    static void print() {
        System.out.println("printing");
    }

    public static void main(String[] args) {
        Car bmw = new Car();
        bmw.brandName = "Bi EM Dablyu";
        bmw.horsePower = 700;
        bmw.isFull = false;
        bmw.print(bmw.brandName, bmw.isFull, bmw.horsePower);
        bmw.voice();
        Car.numberOfWindows = 4;


        Car mercedes = new Car();
        mercedes.brandName = "Mercedes";
        mercedes.horsePower = 500;
        mercedes.isFull = true;
        System.out.println(mercedes);
        mercedes.voice();
        Car.numberOfWindows = 5;

        Car toyota = new Car();
        toyota.brandName = "toyota";
        toyota.horsePower = 200;
        toyota.isFull = true;
        System.out.println(toyota);
        toyota.voice();
        Car.numberOfWindows = 5;


        int x = 5;

        String text = "10";
        // Car mercedes = new Car();
        String text2 = new String("10");

        boolean t = (text.equals(text2));
        System.out.println("t = " + t);

        print();

    }


}
