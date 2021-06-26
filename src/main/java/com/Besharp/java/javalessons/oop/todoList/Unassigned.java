package com.Besharp.java.javalessons.oop.todoList;

/**
 * Created by: Hmayak on Nov, 2019
 */
public class Unassigned extends Engineer {
    private static Unassigned instance;

    private Unassigned() {
        this.name = Constants.UNASSIGNED;
    }

    public static Unassigned getInstance() {
        if (instance == null) {
            instance = new Unassigned();
        }
        return instance;
    }

}
