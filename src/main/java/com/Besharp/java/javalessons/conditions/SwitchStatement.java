package com.Besharp.java.javalessons.conditions;

import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the number for a: ");
        int a = scanner.nextInt();
        System.out.print("Please enter the number for b: ");
        int b = scanner.nextInt();

        System.out.print("Please enter the sign: ");
        String sign = scanner.next();

        if (sign.equals("+")) {
            System.out.println(a + b);
        } else if (sign.equals("-")) {
            System.out.println(a - b);
        }

        //switch case data types char , byte , short , integer, enum, String

//        int [] numbers = {10,11,12,13,14,15};
////                         0  1  2  3  4  5
//        System.out.println(numbers[0]);

//        switch (floor) {
//            case 1: {
//                System.out.println("Vardan");
//                break;
//            }
//            case 2: {
//                System.out.println("Ashot");
//            }
//            case 3: {
//                System.out.println("Ani");
//                break;
//            }
//            case 4: {
//                System.out.println("Gohar");
//                break;
//            }
//            default: {
//                System.out.println("the building is with 4 floor");
//            }
//        }

    }
}
