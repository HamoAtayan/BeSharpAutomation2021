package com.Besharp.java.javalessons.pyramids;

import java.util.Scanner;

/**
 * Created by Hmayak on 08, May, 2021.
 */
public class Asterisks {
    public static void main(String[] args) {
        System.out.print("please type number of rows: ");
        int rows = new Scanner(System.in).nextInt();
        for (int i = rows; i >= 1; --i) {
            for (int j = 1; j <= i; ++j) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

