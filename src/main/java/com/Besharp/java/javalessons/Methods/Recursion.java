package com.Besharp.java.javalessons.Methods;

/**
 * Created by Hmayak on 08, May, 2021.
 */
public class Recursion {
    public static void main(String[] args) {
        int result = sum(10);
        System.out.println(result);
    }
    public static int sum(int k) {
        if (k > 0) {
            return k + sum(k - 1);
        } else {
            return 0;
        }
    }
}
