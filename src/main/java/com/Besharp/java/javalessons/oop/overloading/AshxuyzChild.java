package com.Besharp.java.javalessons.oop.overloading;

public class AshxuyzChild extends Parent {

    public void printHowIsWalking(){
        walk();
    }

    public void test(){
        System.out.println("test");
    }

    @Override
    public void esiminch() {
        System.out.println("esiminch Ashxuyz childi");
    }

    @Override
    public void walk(){
        System.out.println("running");
    }

    public void walk(int i ){
        System.out.println("running");
    }

    public void walk(String l){
        System.out.println("running");
    }
}
