package com.Besharp.java.javalessons.oop.enums;


import java.util.ArrayList;

public class EnumTest {
    private static WeekDaysContract weekDaysContract;

    public static void main(String[] args) {
        WeekDays weekDays = new WeekDays();
        String test = WeekDaysContract.SATURDAY.name();
        System.out.println(test);
        weekDays.tpi(WeekDaysContract.FRIDAY);

        for (WeekDaysContract weekDaysContract : WeekDaysContract.values()) {
            System.out.println(weekDaysContract);
        }

        Person[] arr = {Person.ARTHUR, Person.HAMIK, Person.TIGRAN, Person.VALENTINA, Person.CHRISTINA};

        for (Person persons : arr) {
            System.out.print(persons.getName() + " ");
            System.out.print(persons.getAge() + " ");
            System.out.print(persons.getProfession() + " ");
            System.out.println(persons.getSalary() + " ");

        }
    }

}

