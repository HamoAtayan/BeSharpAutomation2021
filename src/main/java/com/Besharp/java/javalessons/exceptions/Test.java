package com.Besharp.java.javalessons.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * Created by Hmayak Atayan on 22, June, 2021
 **/
public class Test {
    static Test test;

    static void print() {
        int[] arr = {1, 2, 3};
        try {
            FileReader fileReader = new FileReader("/filepath.txt");
            System.out.println(arr[3] / 0);
            System.out.println("esiminch");

        } catch (ArrayIndexOutOfBoundsException | ArithmeticException | FileNotFoundException ex) {
            System.out.println("brnelem exceptiony");
            System.out.println(ex.getMessage());
        }
        finally {

        }

    }

    public static void main(String[] args) {
        print();
        System.out.println("es lav txaem");
    }
}
