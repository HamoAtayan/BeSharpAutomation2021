package com.Besharp.java.javalessons.oop;

/**
 * Created By Hmayak on 2021, Sep, 04
 */
public class Mazda  extends Car{
    public Mazda(String name) {
        super(name);
    }

    @Override
    public void gnal() {
        System.out.println("gnuma mazda 6");
    }

    public void tpiImAnuny(){
        System.out.println(super.getName());
    }
}
