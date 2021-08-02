package com.Besharp.java.javalessons.javacollections.set;

import com.Besharp.java.javalessons.javacollections.map.Human;

import java.util.*;

/**
 * Created by Hmayak Atayan on 20, July, 2021
 **/
public class SetExample {

    public static void main(String[] args) {
        Set<Integer> a = new HashSet<>(Arrays.asList(1, 3, 2, 4, 8, 9, 0));
        Set<Integer> b = new HashSet<>(Arrays.asList(1, 3, 7, 5, 4, 0, 7, 5, null, null));
        Set<String> c = new LinkedHashSet<>(Arrays.asList("B", "C", "A", null, null));

        TreeMap<com.Besharp.java.javalessons.javacollections.map.Human, Integer> human = new TreeMap<>(new Comparator<com.Besharp.java.javalessons.javacollections.map.Human>() {
            @Override
            public int compare(com.Besharp.java.javalessons.javacollections.map.Human o1, com.Besharp.java.javalessons.javacollections.map.Human o2) {
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
        human.put(new Human("Hamik", 25, 2), 2);
        human.put(arthur, 3);

        Set<Human> aa = new HashSet<Human>();


        System.out.println(b);
        System.out.println(c);

        Set<Integer> union = new HashSet<>(a);
        union.addAll(b);
        System.out.print("Union of the two Set");
        System.out.println(union);

        Set<Integer> intersection = new HashSet<>(a);
        intersection.retainAll(b);
        System.out.print("Intersection of the two Set");
        System.out.println(intersection);

        Set<Integer> difference = new HashSet<>(b);
        difference.removeAll(a);
        System.out.println("difference " + difference);

        Set<Integer> difference2 = new HashSet<>(a);
        difference2.removeAll(b);
        System.out.println("difference2 " + difference2);

        Set<Integer> globalDifference = new HashSet<>(difference);
        globalDifference.addAll(difference2);
        System.out.print("globalDifference: ");
        System.out.println(globalDifference);


        Set<String> stringSet = new HashSet<>(Set.of("A", "B", "C", "F", "P"));

//            for (String sS : stringSet) {
//                if (stringSet.contains("F")) {
//                    stringSet.remove("F");
//                }
//            }

            System.out.println(stringSet);

        System.out.println("ancanq araj ");
        Iterator<String> iterator = stringSet.iterator();
        while (iterator.hasNext()) {
            String aaa = iterator.next();
            if (aaa.equals("P")) {
                iterator.remove();
            }
        }
        System.out.println(stringSet);
    }


}

