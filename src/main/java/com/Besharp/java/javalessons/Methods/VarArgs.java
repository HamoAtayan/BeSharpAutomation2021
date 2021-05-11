package com.Besharp.java.javalessons.Methods;

/**
 * Created by Hmayak on 08, May, 2021.
 */
public class VarArgs {

    private static void test(int... args) {
        int sum = 0;
        for (int i : args) {
            sum += i;
        }
        System.out.println("sum = " + sum);

        Object[] obj = {1, 2, 3, 4, "a", "bbb", 'c', true};
    }

    public static void main(String[] args) {
        test(1,2,3,4);
        test12(3,4,5,6,7,8,9);
        test13(array);
    }

    private static void test12(int... args) {
        for (int arg : args) {
            System.out.println(arg);
        }
    }

    static int[] array = {2, 3, 4, 5, 6, 7};

    private static void test13(int[] arr) {
        for (int j : arr) {
            System.out.println(j);
        }
    }
}