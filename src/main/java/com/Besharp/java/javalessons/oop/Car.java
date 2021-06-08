package com.Besharp.java.javalessons.oop;

/**
 * Created by Hmayak on 25, May, 2021.
 */
public class Car {
    //    private final String speed;
    int tiv = 0;
    static int staticTiv = 0;

    public int speed;
    public String name;

    public void run() {
        System.out.println("running in" + speed);
    }

    public Car(String name) {
        this.name = name;
        System.out.println("ind kanchecin");
        ++tiv;
        ++staticTiv;
        System.out.println("tiv = " + tiv);
        System.out.println("staticTiv = " + staticTiv);
    }

    public void gnal() {
        System.out.println("gnum enq");
    }

    public void gnal(int speed, String text) {
        System.out.println("int , String");
    }

    public void gnal(String text, int speed) {
        System.out.println("String, int");
    }


}
