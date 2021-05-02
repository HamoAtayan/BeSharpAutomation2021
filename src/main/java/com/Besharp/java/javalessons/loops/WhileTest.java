package com.Besharp.java.javalessons.loops;

import java.util.Scanner;

public class WhileTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int [5];

        for (int i = 0; i < arr.length; i++) {
//            while (!scanner.hasNextInt()){
//                System.out.println("please enter int number");
//                scanner.next();
//            }
            arr[i] = scanner.nextInt();
        }

        for (int numbers: arr) {
            System.out.print(numbers);
        }
    }
}
