package com.Besharp.java.javalessons.Methods;

/**
 * Created by Hmayak on 08, May, 2021.
 */
public class Recursion {
    static int tiv = 1;

    public static void main(String[] args) {
        System.out.println(factorial(5));
    }

    public static int factorial(int n) {
        if (n > 1) {
            tiv = tiv * n; // 5 // 20 // 60 // 120
            return factorial(n - 1); // 5 * 4 == 20 * 3 == 20 * 2
        } else return tiv;
    }

//    public static int sum(int k) {
//        if (k > 0) {
//            return k + sum(k - 1);
//        } else {
//            return 0;
//        }
//    }


}
