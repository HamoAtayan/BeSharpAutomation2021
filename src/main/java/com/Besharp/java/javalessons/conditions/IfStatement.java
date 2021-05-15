package com.Besharp.java.javalessons.conditions;

import java.util.Scanner;

public class IfStatement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("please write a value for a: ");
        int a = scanner.nextInt(); //15
        int b = 15;
        int c = 30;
        String number = "20";


        if (a > b && a < c) {
            if (a > 22) {
                System.out.println("mece 22");
            } else {
                System.out.println("poqr 22");
            }
        } else if (a == b) {
            System.out.println("havasar e");
        } else {
            System.out.println("poqr e");
        }
//        int parsedNumber = Integer.parseInt(number);
//        System.out.println(parsedNumber);
        boolean bool = a < b;
        System.out.println(bool);
//        boolean bool = a != b;
        System.out.println(bool);
        System.out.println(++a);

//        System.out.println(++a);
//        System.out.println(a++);
//        System.out.println(a);
//        String sigh = "<";

        if (a > b || a == 0) {
            System.out.println("a < b");
            if (a < 13) {
                System.out.println("a < 13");
                if (a < 100) {
                    System.out.println("a < 100");
                }
            }

            System.out.println("> or equal to 0");
            a++;
            System.out.println(a);
        } else if (a == b) {
            System.out.println("=");
        } else if (a == 0) {
            System.out.println("a = 0");
        } else {
            System.out.println("<");
        }


// todo       which kind of operations we can do in if block?

//        else if (a == b){
//            System.out.println("=");
//        }

//        else if (a == 0){
//            System.out.println("a=0");
//        }
//        else {System.out.println("<");}

    }
}
