package com.Besharp.java.javalessons.oop.abstraction;

public class Christina implements OnePlanetContract {


    public Christina (int age, String proffesion){
    }



    public Christina(){}

    @Override
    public void salary() {
        System.out.println("10000000");
    }

    @Override
    public void workLog() {
        System.out.println("gorc chem anum");
    }

    @Override
    public void vacationBalance() {
        System.out.println(20);
    }
}
