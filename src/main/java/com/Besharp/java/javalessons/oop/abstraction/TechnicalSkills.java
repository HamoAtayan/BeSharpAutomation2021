package com.Besharp.java.javalessons.oop.abstraction;

public interface TechnicalSkills {

    void automationSkkills();
    void codingSkills();
    void dbSkills();
    void apiSkills();

    default void thirteenSalary() {
        System.out.println("Technical skills");

    }
}
