package com.Besharp.java.javalessons.javacollections.map;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by Hmayak Atayan on 27, July, 2021
 **/
public class TreeMapExample {

    public static void main(String[] args) {
        Map<Human, Integer> human = new TreeMap<>(new Comparator<Human>() {
            @Override
            public int compare(Human o1, Human o2) {
                if (o1.getAge() < o2.getAge()) {
                    return 1;
                } else if (o1.getAge() > o2.getAge()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });

        Human tiko = new Human("Tiko", 22, 3);
        Human hamik = new Human("Hamik", 24, 1);
        Human arthur = new Human("Arthur", 22, 3);

        human.put(tiko, 4);
        human.put(new Human("Valentina", 30, 3), 1);
        human.put(hamik, 4);
        human.put(arthur, 3);

        System.out.println(human);

        //todo add human in map then change the value
        //todo add other object in map

        Map<String, Double> xndzorner = new TreeMap<>();
        xndzorner.put("a", 0.500);
        xndzorner.put("b", 0.200);
        xndzorner.put("c", 0.300);
        System.out.println(xndzorner);

        Human human1 = new Human("aaa",1,1);
        System.out.println(human1);

    }
}
