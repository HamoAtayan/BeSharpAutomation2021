package com.Besharp.java.javalessons.methods;

/**
 * Created by Hmayak on 11, May, 2021.
 */
public class MethodTest3 {
    public static void main(String[] args) {


        System.out.println(sumOfTwoNumbers(1,2));
        System.out.println(sumOfTwoNumbers(3,4.0F));
    }

    static int sumOfTwoNumbers (int a, int b){
        return a + b;
    }



    static int sumOfTwoNumbers (int c, float d){
        return (int) (c + d);
    }

      static int sumOfTwoNumbers (int d, int e, int f){
            return (d + d);
        }



}
