package com.Besharp.java;

import java.util.Scanner;

/**
 * Created by Hmayak Atayan on 13, Apr, 2021
 */
public class TestClass {
    public static void main(String[] args) {
        Scanner TT = new Scanner(System.in);
        System.out.print("number of hours worked: ");
        int a = TT.nextInt();
        System.out.print("hourly pay rent: ");
        int b = TT.nextInt();
        int c = a*b;
        System.out.print("total value: ");
        System.out.println(c);

    }
}
