package com.Besharp.java.javalessons.exceptions;

/**
 * Created by Hmayak Atayan on 22, June, 2021
 **/
public class Main {
    public static void main(String[] args) throws MyException {

        for (int i = 0; i < 5; i++) {

            try {
                Api.sum(20, 30);
            } catch (MyException exception) {
                System.out.println("my exception");
            } finally {
                System.out.println("es misht ashxateluem");
            }
        }

    }
}
