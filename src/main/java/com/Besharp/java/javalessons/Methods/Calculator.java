package com.Besharp.java.javalessons.Methods;

import java.util.Scanner;

/**
 * Created by Hmayak on 11, May, 2021.
 */
public class Calculator {
    static int temp = 0;

    public static void main(String[] args) {

        System.out.println(calculator());

    }


    static double sum(double tiv, double tiv2) {
        return tiv + tiv2;
    }

    static double minus(double tiv, double tiv2) {
        return tiv - tiv2;
    }

    static double multiply(double tiv, double tiv2) {
        return tiv * tiv2;
    }

    static double division(double tiv, double tiv2) {
        return tiv / tiv2;
    }

    public static double calculator() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("please enter number 1: ");
        double number1 = scanner.nextDouble();
        System.out.print("please enter number 2: ");
        double number2 = scanner.nextDouble();
        System.out.print("please enter the sign: ");
        String sign = scanner.next();

        switch (sign) {
            case "+": {
                return sum(number1, number2);
            }
            case "-": {
                return minus(number1, number2);
            }
            case "*": {
                return multiply(number1, number2);
            }

            case "/": {
                return division(number1, number2);
            }
            default:

                if (++temp < 5) {
                    System.out.println("wrong sign: please enter the signs + - * / ");
                    return calculator();
                } else return 0;
        }
    }
}
