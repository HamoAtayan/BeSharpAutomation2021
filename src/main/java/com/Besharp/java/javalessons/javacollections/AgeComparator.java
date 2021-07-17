package com.Besharp.java.javalessons.javacollections;

import java.util.Comparator;

/**
 * Created by Hmayak Atayan on 17, July, 2021
 **/
public class AgeComparator implements Comparator<Mard> {
    @Override
    public int compare(Mard m1, Mard m2) {
        return Integer.compare(m1.getAge(), m2.getAge());
    }
}
