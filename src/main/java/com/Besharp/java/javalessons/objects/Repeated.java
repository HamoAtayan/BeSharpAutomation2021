package com.Besharp.java.javalessons.objects;

/**
 * Created by Hmayak on 18, May, 2021.
 */
public class Repeated {


    static class RepeatElement {
        void printRepeating(int arr[], int size) {
            int i, j;
            System.out.println("Repeated Elements are :");
            for (i = 0; i < size; i++) {
                for (j = i + 1; j < size; j++) {
                    if (arr[i] == arr[j])
                        System.out.print(arr[i] + " ");
                }
            }
        }

        public static void main(String[] args) {
            RepeatElement repeat = new RepeatElement();
            int[] arr = {1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 3, 4, 5, 6, 7, 7, 7, 7, 7, 7, 7, 8, 8, 8, 9, 9, 9, 9};
            int arr_size = arr.length;
            repeat.printRepeating(arr, arr_size);
        }
    }

}
