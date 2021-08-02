package com.Besharp.java.javalessons.oop.training;

/**
 * Created by Hmayak Atayan on 31, July, 2021
 **/
public class Example extends Parent implements MyInterface {
    public static final int AGE = 28;
    private String name = "Hamo";

    private String lastname;

    public static void printAge() {
        System.out.println(AGE);
    }


    public void printText(String text) {
        System.out.println(text);
    }


    public void printText(int text3) {
        System.out.println(text3);
    }

    public void printText(int text3, String aaa) {
        System.out.println(text3 + " " + aaa);
        System.out.println("int heto string");
    }

    public void printText(String aaa, int text3) {
        System.out.println(aaa + text3);
        System.out.println("string heto int");
    }


    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public Example(String name, String lastname) {
        this.name = name;
        this.lastname = lastname;
    }

    @Override
    public void tpi(){
        System.out.println("asd");
    }

    @Override
    public void tpiEsLavTxaem(){
        System.out.println("tpi es lav txaem child");
    }


}
