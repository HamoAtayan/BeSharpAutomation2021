package com.Besharp.java.javalessons.javacollections.map;

import java.util.HashMap;
import java.util.Hashtable;

/**
 * Created by Hmayak Atayan on 27, July, 2021
 **/
public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String, Integer> students = new HashMap<>();
        students.put("Valentina", 88);
        students.put("Hamik", 90);
        students.put("Arthur", 90);
        students.put("Tigran", 89);

        System.out.println(students);

        students.put("Hamo", 20);
        System.out.println(students);

        Hashtable<String, Integer> aaa = new Hashtable<>();

        System.out.println(students.get("Valentina"));
    }
}
