package com.Besharp.java.javalessons.generics;

/**
 * Created by Hmayak Atayan on 13, July, 2021
 **/
public class GenAvg<T extends Number> {

private int age;
    T[] array;

    GenAvg(T[] array) {
        this.array = array;
    }

    public T[] getArray() {
        return array;
    }

    double average() {
        double sum = 0.0;
        for (T e : getArray()
        ) {
            sum += e.doubleValue();
        }
        return sum / array.length;
    }
}
