package com.Besharp.java.javalessons.objects;

import java.util.Arrays;

/**
 * Created by Hmayak on 18, May, 2021.
 */
public class MyHomeWork {
    public static void main(String[] args) {

        int[] arr = {1, 1, 1, 1, 2, 2, 2, 3, 4, 4, 6, 6, 7, 8, 8, 8, 8, 8,8,8};


        int element = Integer.MIN_VALUE;
        int max_count = 1;
        int count = 1;
        int value = 0;


        Arrays.sort(arr);

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1])
                count++;
            else {
                //compare the count with max_count
                if (count > max_count) {
                    //update if count is greater

                    max_count = count;
                    element = arr[i - 1];
                }
                //reset count to 1
                count = 1;
            }

        }
        System.out.println(count + " values is: " + value );
    }
}