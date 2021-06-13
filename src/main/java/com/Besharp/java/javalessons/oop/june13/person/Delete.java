package com.Besharp.java.javalessons.oop.june13.person;

import com.Besharp.java.javalessons.oop.june13.Person;

public class Delete {

    public static void main(String[] args) {
        Address address = new Address("Armenia", "Yerevan", "Rubinyanc poxoc", 2250);
        Address address2 = new Address("Armenia", "Abovyan poxoc", 2010);

        Company company = new Company("Noor Games", address);

        Job qaEngineer = new Job("Qa", company, 100000);

        Person person = new Person(23, "Valentina", address, qaEngineer,UserType.ADMIN);

        System.out.println(person);
    }
}

