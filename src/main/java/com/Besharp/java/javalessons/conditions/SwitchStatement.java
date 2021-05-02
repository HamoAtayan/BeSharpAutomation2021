package com.Besharp.java.javalessons.conditions;

import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the number floor: ");
        int floor = scanner.nextInt();

        //switch case data types char , byte , short , integer, enum, String

//        int [] numbers = {10,11,12,13,14,15};
////                         0  1  2  3  4  5
//        System.out.println(numbers[0]);
        int numer = 2;
        if (10 < numer){
            System.out.println("10 lower than number");
        }

        switch (floor) {
            case 1: {
                System.out.println("Vardan");

            }
            case 2: {
                System.out.println("Ashot");

            }
            case 3: {
                System.out.println("Ani");

            }
            case 4: {
                System.out.println("Gohar");
                break;
            }
        }

    }
}
