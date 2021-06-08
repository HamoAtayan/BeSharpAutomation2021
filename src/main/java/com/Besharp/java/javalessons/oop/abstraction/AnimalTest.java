package com.Besharp.java.javalessons.oop.abstraction;

public class AnimalTest {
    int tiv;

    public int returnTiv(){
        //Select query
        final int pi;
        pi = 100;        //Select query
        tiv = pi;

        return tiv;
    }


    public AnimalTest(int pi, String text) {
    }

    public static void main(String[] args) {


        Animal animal = new Animal() {
            @Override
            public void sound() {
                System.out.println("aaa");
            }
        };

        animal.sound();


    }
}
