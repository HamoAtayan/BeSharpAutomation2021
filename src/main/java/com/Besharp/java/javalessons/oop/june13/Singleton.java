package com.Besharp.java.javalessons.oop.june13;

public class Singleton {
    private static Singleton singleton;

    private Singleton(){
        System.out.println("Creating an instance");
    }

    public static Singleton getSingleton(){
        if (singleton == null){
            singleton = new Singleton();
        }
        return singleton;
    }
}
