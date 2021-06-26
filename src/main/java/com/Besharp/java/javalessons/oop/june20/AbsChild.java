package com.Besharp.java.javalessons.oop.june20;

/**
 * Created by Hmayak Atayan on 20, June, 2021
 **/
public class AbsChild extends Abs{
    @Override
    void test() {
        System.out.println("override");
    }

   void test(String text){
       System.out.println("overload");
   }
}
