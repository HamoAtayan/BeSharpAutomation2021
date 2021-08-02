package com.Besharp.java.javalessons.javacollections.map;

/**
 * Created by Hmayak Atayan on 27, July, 2021
 **/
public class ForeachExample {
    public static void main(String[] args) {
        int[] array = {1, 24, 5, 6, 6, 7, 7};
        for (int i : array) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        System.out.println("-------------------------------------------");
        for (int i = 0; i < array.length; i += 2) {
            System.out.println(array[i]);
        }
    }
}
