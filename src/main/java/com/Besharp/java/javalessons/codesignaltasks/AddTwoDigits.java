package com.Besharp.java.javalessons.codesignaltasks;

import java.util.Scanner;

/**
 * Created by Hmayak on May, 2021.
 */

//You are given a two-digit integer n. Return the sum of its digits.
public class AddTwoDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("please enter two digit number: ");
        int twoDigitNumber = scanner.nextInt();

        System.out.println("the sum of two number is : " + ((twoDigitNumber / 10) + (twoDigitNumber % 10)));
    }
}
