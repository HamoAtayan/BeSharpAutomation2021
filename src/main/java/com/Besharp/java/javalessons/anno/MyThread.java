package com.Besharp.java.javalessons.anno;

/**
 * Created by Hmayak Atayan on 10, July, 2021
 **/
public class MyThread extends Thread {

    static int counter;

    MyThread() {
        ++counter;
        System.out.println(counter);
        start();
    }

    MyThread(int tiv) {
        ++counter;
        System.out.println(counter);
    }

    @Override
    public void run() {
        System.out.println("running thread" + getName() + " id " + getId());
    }
}
