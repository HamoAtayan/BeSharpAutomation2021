package com.Besharp.java.javalessons.HomewWork;

import java.util.Arrays;

public class IsPrime {
    public static void main(String[] args) {
        int[] numbers = {10, 15, 17, 3, 5, 88};
        int[] kent = new int[numbers.length];
        int[] zuyg = new int[numbers.length];
        int[] parz = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {

            {
                if (numbers[i] % 2 == 0) {
                    zuyg[i] = numbers[i];
                } else {
                    kent[i] = numbers[i];
                }
            }
        }

        System.out.println("zuyger = " + Arrays.toString(zuyg));
        System.out.println("kenter = " + Arrays.toString(kent));


        for (int i = 0; i < numbers.length ; i++) {
           if (isParz(numbers[i])){
               parz[i] = numbers[i];
           }
        }

        System.out.println("parzern en " + Arrays.toString(parz));
    }

    public static boolean isParz(int a) {
        for (int i = 2; i <= Math.sqrt(a); i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }
}
