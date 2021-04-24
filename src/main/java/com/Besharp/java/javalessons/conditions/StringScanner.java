package com.Besharp.java.javalessons.conditions;

import java.util.Scanner;

public class StringScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();
        System.out.println(text);

        if (text.equals("yes")){
            System.out.println("yes");
        }
    }
}
