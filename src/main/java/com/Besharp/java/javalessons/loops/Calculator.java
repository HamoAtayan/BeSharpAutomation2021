package com.Besharp.java.javalessons.loops;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("please enter first number: ");
        double number1 = scanner.nextDouble();
        System.out.print("please enter second number: ");
        double number2 = scanner.nextDouble();
        System.out.print("please enter the sigh: ");
        String operation = scanner.next();

        switch (operation) {
            case "+": {
                System.out.println("sum of number1 + number2 =" + number1 + " + " + number2 + " = " + (number1 + number2));
                break;
            }
            case "-": {
                System.out.println("sum of number1 + number2 =" + number1 + " + " + number2 + " = " + (number1 - number2));
                break;
            }
            case "*": {
                System.out.println("sum of number1 + number2 =" + number1 + " + " + number2 + " = " + (number1 * number2));
                break;
            }
            case "/": {
                System.out.println("sum of number1 + number2 =" + number1 + " + " + number2 + " = " + (number1 / number2));
                break;
            }
            default:
                System.out.println("wrong operation");
        }
    }
}
