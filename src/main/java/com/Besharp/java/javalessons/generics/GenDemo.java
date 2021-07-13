package com.Besharp.java.javalessons.generics;

/**
 * Created by Hmayak Atayan on 13, July, 2021
 **/
public class GenDemo {
    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 5, 7, 88, 1, 6, 45};
        Double[] doubleArray = {10.0, 1.2, 77.58, 4.4, 97.01};
        String[] stringArray = {"Abc", "Test", "FF"};
        int[] interArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        Double a = 10.5;
        System.out.println("-------------------");

        boolean aaa = true;

        GenDemo genDemo = new GenDemo();
        genDemo.printArray(stringArray, true, intArray);

        Mard mard = new Mard();
        Gen<Mard> gen = new Gen<>(mard);
        gen.showType();

        Gen<String> gen2 = new Gen<>("mardaker");
        gen2.showType();

        Gen<Integer> gen3 = new Gen<>(12);
        gen3.showType();

    }
    //todo create loops to print arrays
    // make methods generic
    // generic letters  T , E ,K ,V
    // generic with 2 params

    int x = 10; // pass to mwthod and with int array


    private <T, E> void printArray(T[] array, boolean isEqual, E[] array2) {
        // isEqual = aaa;
//        if (array[0].getClass().toString().contains("Double")){
//            return;
//        }
        for (T i : array) {
            System.out.print(" " + i);
        }
        System.out.println(" " + isEqual);
        for (E j : array2) {
            System.out.print(" " + j);
        }
        System.out.println();
    }

    void porintSum(int a, double b) {
        System.out.println(a + b);
    }
}
