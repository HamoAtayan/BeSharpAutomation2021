package com.Besharp.java.javalessons.arrays;

public class MultiDimensionalArray {
    public static void main(String[] args) {
        int[][] array = new int[3][2];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) { //why array[i].lenght?
                array[i][j] = (int) (Math.random() * 100);
                System.out.println("array [" + i + "]" + " [" + j + "] = " + (array[i][j]));
            }
            System.out.println();
        }
    }
}
