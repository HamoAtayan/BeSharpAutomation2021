package com.Besharp.java.javalessons.oop.june20;

/**
 * Created by Hmayak Atayan on 20, June, 2021
 **/
public class Main {
    public static void main(String[] args) {
        Bmw troyka = new Bmw(260,"E46");
        Bmw troyka1 = new Bmw(300,"E90");
        Bmw troyka2 = new Bmw(330,"F30");
        Example example = new Example("test");
        Example example1 = new Example("test2");
        Example example2 = new Example("test3");

        System.out.println(troyka);
        System.out.println(troyka1);
        System.out.println(troyka2);
        System.out.println(Bmw.numberOfWheel);
        System.out.println("example = " + example);
        System.out.println("example1 = " + example1);
        System.out.println("example2 = " + example2);

        System.out.println(new Car(200,"Mazda 6"));
    }
}
