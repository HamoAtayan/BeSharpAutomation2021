package com.Besharp.java.javalessons.oop.june13.person;

import com.Besharp.java.javalessons.oop.june13.Person;

/**
 * Created by: Hmayak on Jun, 2021
 */
public class DataRepo {
    public static Person[] data = new Person[3];

    static {
        Address address = new Address("Armenia", "Abovyan", "GArni 3", 2202);
        Address workAddress = new Address("Armenia", "Abovyan", "GArni 3", 2202);
        Company company = new Company("Webbfonatine", workAddress);
        Job job = new Job("QA", company, 700000);
//        Person person = new Person(18, "Hamo", address, job);
//
//        data[0] = new Person(10, "Hamo", address, job);
//        data[1] = new Person(20, "aa", address, job);
//        data[2] = new Person(30, "bb", address, job);
    }


}
