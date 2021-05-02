package com.Besharp.java.javalessons.HomewWork;

import java.util.Scanner;

public class IsInputExistsInArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 77, 8, 32, 10};

        System.out.print("please enter the number to check exists or not: ");
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();
        boolean isExists = false;

        for (int number:array) {
            if (number == userInput){
                isExists = true;
                System.out.println("exists");
                break;
            }
        }

        if (!isExists){
            System.out.println("doesn't exists");
        }

    }
}
