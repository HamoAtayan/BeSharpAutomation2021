package com.Besharp.java.javalessons.arrays;

/**
 * Created By Hmayak on 2021, Nov, 08
 */
public class Missing {
    public static void main(String[] args) {
        int[] aaa = {1, 2, 3, 4, 5, 8, 11, 13, 15, 18, 19, 22};

        int dif= aaa[0];

        for (int i = 0; i < aaa.length; i++) {
            if (aaa[i] - i != dif){


                while (dif < aaa[i] - i) {
                    System.out.println(aaa[i] + dif + " ");
                    dif++;
                }
            }
        }

    }
}
