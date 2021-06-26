package com.Besharp.java.javalessons.oop.todoList;

/**
 * Created by: Hmayak on Nov, 2019
 */
public class EngineerRepo {

    private EngineerRepo() {
        //empty private require constructor for avoiding new instance creation
    }

    private static Engineer [] engineers = new Engineer[6];

    static {
        System.out.println("engineers init");
        engineers[0] = new Engineer("Hamo", Role.QA);
        engineers[1] = new Engineer("Dave the designer", Role.DEVELOPER);
        engineers[2] = new Engineer("Mko", Role.DEV_OPS);
        engineers[3] = new Engineer("Heno", Role.DEVELOPER);
        engineers[4] = new Engineer("Gohar", Role.QA);
        engineers[5] = new Engineer("Avag", Role.PM);
    }

    public static Engineer[] get() {
        return engineers;
    }
}
