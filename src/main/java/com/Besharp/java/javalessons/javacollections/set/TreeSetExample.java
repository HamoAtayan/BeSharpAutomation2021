package com.Besharp.java.javalessons.javacollections.set;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * Created by Hmayak Atayan on 20, July, 2021
 **/
public class TreeSetExample {
    public static void main(String[] args) {

//        TreeSet<Human> humans = new TreeSet<>();
//        humans.add(new Human(30, "Arthur", "Madoyan", 5));
//        humans.add(new Human(23, "Valentina", "Chakhoyan", 2));
//        humans.add(new Human(25, "Tigran", "Seyranyan", 1));
//        humans.add(new Human(24, "Hamik", "Babayan", 3));
//
//
//        System.out.println(humans);
//        for (Human uchenikner : humans
//        ) {
//            System.out.println(uchenikner);
//        }
//
//
        TreeSet<Human2> human2s = new TreeSet<>(new Comparator<Human2>() {
            @Override
            public int compare(Human2 o1, Human2 o2) {
                if (o1.getAge() < o2.getAge()) {
                    return 1;
                } else if (o1.getAge() > o2.getAge()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
        human2s.add(new Human2(30, "Arthur", "Madoyan", 5));
        human2s.add(new Human2(23, "Valentina", "Chakhoyan", 2));
        human2s.add(new Human2(25, "Tigran", "Seyranyan", 1));
        human2s.add(new Human2(24, "Hamik", "Babayan", 3));
        System.out.println(human2s);
    }
}
