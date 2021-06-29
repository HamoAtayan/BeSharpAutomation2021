package com.Besharp.java.javalessons.ref;

/**
 * Created by Hmayak Atayan on 29, June, 2021
 **/
public class RefObject {
    private String name;
    private int length;
    String description;
    public double range;
    public Object basObj;

    private void method1() {
        System.out.println("method 1 executed");
    }

    private void method2(String text) {
        System.out.println("method 2 executed");
    }

    public void print(){
        System.out.println("public method");
    }

    private void method3() {
        System.out.println("method 3 executed");
    }


    public RefObject() {
    }

    public RefObject(String text) {
    }

    private RefObject(String x, int y) {
    }

}
