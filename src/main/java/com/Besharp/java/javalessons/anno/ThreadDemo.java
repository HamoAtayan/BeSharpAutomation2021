package com.Besharp.java.javalessons.anno;

/**
 * Created by Hmayak Atayan on 10, July, 2021
 **/
public class ThreadDemo {

    // extents from Thraed class
    // implements Runnable interface

    // main thread start exit
    //create multiple threads
    //how to start through the cconstructor

    static MyThread myThread3;
    int i;
    static String text;

    public static void main(String[] args) throws InterruptedException {
        System.out.println("start");

        MyThread myThread = new MyThread();
        System.out.println("1000");

        MyThread myThread2 = new MyThread();
        System.out.println("2000");

        myThread3 = new MyThread(10);
        new Thread(new MyRunnable()).start();


        text = "aaa";


            new ThreadDemo().test();

        System.out.println("end");

    }

    public void test() throws InterruptedException {
        myThread3.sleep(5000);
        System.out.println("3000");
    }
}
