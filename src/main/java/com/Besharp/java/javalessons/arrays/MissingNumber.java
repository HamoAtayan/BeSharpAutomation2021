package com.Besharp.java.javalessons.arrays;

/**
 * Created By Hmayak on 2021, Nov, 08
 */
public class MissingNumber {
    static void printMissingElements(int[] arr) {

        // Initialize diff
        int diff = arr[0];

        for (int i = 0; i < arr.length; i++) {

            // Check if diff and arr[i]-i
            // both are equal or not
            if (arr[i] - i != diff) {

                // Loop for consecutive
                // missing elements
                while (diff < arr[i] - i) {
                    System.out.print((i + diff) + " ");
                    diff++;
                }
            }
        }
    }

    // Driver Code
    public static void main(String[] args) {

        // Given array arr[]
        int[] arr = {6, 7, 10, 11, 13, 15, 17, 22};

        // Function call
        printMissingElements(arr);
    }
}
