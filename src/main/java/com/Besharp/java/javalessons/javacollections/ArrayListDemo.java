package com.Besharp.java.javalessons.javacollections;

import com.Besharp.java.javalessons.javacollections.map.Human;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Hmayak Atayan on 13, July, 2021
 **/
public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>(14); //initial capacity 10
        array.add(1);
        array.add(1);
        array.add(1);
        array.add(1);
        array.add(1);
        array.add(1);
        array.add(123);
        System.out.println(array.size());

        String[] names = {"Valentina", "Hamik", "Artur", "Tiko", "Hamo"};
        System.out.println(names[5]);

        // load factor = 0.75
        // resize factor = oldCapacity * 3/2 +1 //16
        //when starting resize? and how much is new capacity when initial capacity is 14

        // O(n) max number from the array
        // O(n2) sort array
        // O(log 2 n) for E.G. Trees
        // O(1) one step complexity
    }

}
