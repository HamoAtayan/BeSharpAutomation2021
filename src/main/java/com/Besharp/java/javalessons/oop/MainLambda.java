package com.Besharp.java.javalessons.oop;

import automation.Main;

/**
 * Created By Hmayak on 2021, Aug, 28
 */
public class MainLambda {

    public static void main(String[] args) {
        MyLambda anonimous = new MyLambda() {


            @Override
            public void barev(String s) {
                System.out.println("hi " + s);
            }
        };

        anonimous.barev("10");


        MyLambda lambda = s -> {
            System.out.println("lambda expression " + s);
            System.out.println("lambda expression " + s);
        };
        lambda.barev("10");

        MainLambda lambda1 = new MainLambda();
        lambda1.print(s-> System.out.println("hi"));
    }

    public void print(MyLambda myLambda){
        System.out.println("printing my lambda object");
    }
}
