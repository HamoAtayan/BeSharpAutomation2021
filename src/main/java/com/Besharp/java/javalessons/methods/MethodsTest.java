package com.Besharp.java.javalessons.methods;

/**
 * Created by Hmayak on 08, May, 2021.
 */
public class MethodsTest {
    static String a;


    public static void main(String[] args) {
        getCommmentedText();
        String a = "9 Comments";
    }

    public static String getCommmentedText() {
        return "9 Comments";
    }

    public static String initText(boolean isExists) {
        if (isExists) {
            return "exists";
        } else return "not extists";

    }

    public static String initText2(boolean isExists) {
        if (isExists) {
            return "exists";
        } else return "not extists";

    }


}