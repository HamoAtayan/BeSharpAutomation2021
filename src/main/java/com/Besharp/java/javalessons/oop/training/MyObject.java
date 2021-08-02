package com.Besharp.java.javalessons.oop.training;

import java.sql.PseudoColumnUsage;

/**
 * Created by Hmayak Atayan on 31, July, 2021
 **/
public class MyObject {
    public static void main(String[] args) {

        Example example = new Example("test", "testoyan");
        Example example1 = new Example("test1", "testoyan1");
        Example example2 = new Example("test2", "testoyan2");
        Example example3 = new Example("test3", "testoyan3");
        example.tpiMIBan();


        System.out.println(example.getName() + " " + example.getLastname());
        System.out.println(example.AGE);
        System.out.println(example1.getName() + " " + example1.getLastname());
        System.out.println(example1.AGE);
        System.out.println(example2.getName() + " " + example2.getLastname());
        System.out.println(example2.AGE);
        System.out.println(example3.getName() + " " + example3.getLastname());
        System.out.println(example3.AGE);

        System.out.println("------------------");
        Example.printAge();
        Example.printAge();
        Example.printAge();
        Example.printAge();

        String bbb = "asd";
        int a = 10;
        example.printText(bbb);
        example.printText(a);
        example.printText(110,"aaaa");
        example.printText("aaaa", 20);

        example.tpiEsLavTxaem();

        Parent child = new Example("aaa","bbb");
        Example child2 = new Example("aaa","bbb");
        child.tpiEsLavTxaem();
        child.tpiMIBan();
       

    }
}