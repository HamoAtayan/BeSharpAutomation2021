package com.Besharp.java.javalessons.arrays;

import java.util.Arrays;

/**
 * Created by Hmayak on May, 2021.
 */
public class Multi {
    public static void main(String[] args) {
        int[][] arrays = {{1, 2, 3, 4, 5, 6}, {7, 8, 9}, {10, 11, 12, 13}, {14, 15, 16}};
                            // i = 0            i = 1       i = 2           i = 3

        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j < arrays[i].length; j++) {
                System.out.print("i = " + i + " j = " + j + " array output = " + arrays[i][j]);
            }
            System.out.println();
        }


    }
}
