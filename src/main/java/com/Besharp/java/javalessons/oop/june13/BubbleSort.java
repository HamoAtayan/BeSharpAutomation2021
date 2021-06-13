package com.Besharp.java.javalessons.oop.june13;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] array = {4, 5, 1, 8, 4, 9, 6, 25, 7, 8, 88};
        System.out.println( Arrays.toString(bubbleSort(array)));
    }


    static  int [] bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j+1] and arr[j]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }


}