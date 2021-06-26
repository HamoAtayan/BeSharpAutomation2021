package com.Besharp.java.javalessons.oop.abstraction;

public interface OnePlanetContract {

    void salary();

    void workLog();

    void vacationBalance();

     default void thirteenSalary() {
        System.out.println("sorry pox chka");

    }

    //private, public, protected, default/package private


    static String companyName() {
        System.out.println("OnePlanet");
        return "OnePlanet";
    }

    default void work(){
        System.out.println("one planet work");
    }

}
