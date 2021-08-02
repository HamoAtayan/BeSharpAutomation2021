package com.Besharp.java.javalessons.javacollections;

import com.Besharp.java.javalessons.string.A;
import com.Besharp.java.javalessons.string.C;

import java.util.*;

/**
 * Created by Hmayak Atayan on 17, July, 2021
 **/
public class LinkedListDemo {

    public static void main(String[] args) {
//        Mard mard = new Mard(20,"AAA");
//        Mard mard2 = new Mard(30,"bbb");
//
//        Parent parent = new Child();
//        parent.walk();
//
//        ArrayList<Integer> tver = new ArrayList<>(3);
//        tver.add(1);
//        tver.add(2);
//        tver.add(3);
//        tver.add(4);
//
//        System.out.println(tver);
//        tver.remove(2);
//        System.out.println(tver);
//
//        mard = mard2;

        LinkedList<Integer> aaa = new LinkedList<>();
        aaa.add(1);
        aaa.add(10);
        aaa.add(30);
        aaa.add(50);
        aaa.add(5);

//        Iterator<Integer> strings = aaa.iterator();
//        while (strings.hasNext()) {
//            strings.remove();
//        }


//        Mard Artur =;
//        Mard Valentina = new Mard(23, "Valentina", "Chakhoyan", 2);
//        Mard Tigran = new Mard(25, "Tigran", "Seyranyan", 1);
//        Mard Hamik = new Mard(25, "Hamik", "Babayan", 3);

        List<Mard> mardiq = new LinkedList<>();
//        mardiq.add(Artur, Valentina, Tigran, Hamik);
//        System.out.println(sum(7, 8, 9, 10, 11, 5, 5, 5, 5, 5, 5, 5));

        mardiq.add(new Mard(30, "Arthur", "Madoyan", 5));
        mardiq.add(new Mard(23, "Valentina", "Chakhoyan", 2));
        mardiq.add(new Mard(25, "Tigran", "Seyranyan", 1));
        mardiq.add(new Mard(24, "Hamik", "Babayan", 3));
//        System.out.println(mardiq);
        mardiq.sort(new AgeComparator());

        System.out.println("---------------------------------------");
        System.out.println(mardiq.get(2));
        List<Mard> mardiq2 = new ArrayList<>(mardiq);
        System.out.println(mardiq2);
        //ArrayList<String> hash2 = new ArrayList<String>(hash);

        System.out.println("-----------------------------------------------------------");

        for (Mard mardiq3 : mardiq
        ) {
            System.out.println(mardiq3);
        }

        System.out.println("mardik sort by work experiance");
        mardiq.sort((o1, o2) -> {
            if (o1.getAge() < o2.getAge()) {
                return 1;
            } else if (o1.getAge() > o2.getAge()) {
                return -1;
            } else {
                return 0;
            }
        });

        for (Mard mardiq4 : mardiq
        ) {
            System.out.println(mardiq4);
        }


//    static int sum(int... values) {
//        int sum = 0;
//        for (int element : values
//        ) {
//            sum += element;
//        }
//        return sum;
//    }


    }
}
