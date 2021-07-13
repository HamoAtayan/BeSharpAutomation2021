package com.Besharp.java.javalessons.generics;

/**
 * Created by Hmayak Atayan on 13, July, 2021
 **/
public class GenAvgDemo {
    public static void main(String[] args) {
        Integer[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

        Double[] array2 = {1.1, 2.3, 3.2, 4.6, 5.4, 6.5, 7.6, 8.7, 9.8, 10.8, 11.9};

        GenAvg<Integer> integerGenAvg = new GenAvg<>(array);
        double avg = integerGenAvg.average();
        System.out.println("avg = " + avg);

        //Mard mard = new Mard();

        GenAvg<Double> doubleGenAvg = new GenAvg<>(array2);
        double genAvg = doubleGenAvg.average();
        System.out.println("doubleGenAvg = " + genAvg);

    }
}
