package com.Besharp.java.javalessons.oop.overloading;

public class Task {

    public static int staticCount = 0;
    public int count = 0; // chenq kara grenq Task.count
    // how many times constructor called

    public Task() {
        ++staticCount;
        ++count;
    }
}
