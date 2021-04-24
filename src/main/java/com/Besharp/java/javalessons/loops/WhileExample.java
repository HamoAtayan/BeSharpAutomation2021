package com.Besharp.java.javalessons.loops;

import java.util.Scanner;

public class WhileExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter a number: ");
        if (scanner.hasNextInt()) {
            int number = -1;
            while (number != 0) {
                number = scanner.nextInt();
                System.out.println("number = " + number);
            }
        }
    }
}
