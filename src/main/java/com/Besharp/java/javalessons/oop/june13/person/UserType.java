package com.Besharp.java.javalessons.oop.june13.person;

/**
 * Created by: Hmayak on Jun, 2021
 */
public enum UserType {
    ADMIN(5),
    USER(1),
    HULK(3),
    SPIDERMAN(0),
    SUPER(2),
    TEST(6),
    TESTOYAN(4);

    private final int priority;

    UserType(int prority) {
        this.priority = prority;
    }

    public  int getPriority(){
        return priority;
    }

}
