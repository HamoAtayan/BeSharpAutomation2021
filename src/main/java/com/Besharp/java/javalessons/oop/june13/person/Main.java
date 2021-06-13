package com.Besharp.java.javalessons.oop.june13.person;

import com.Besharp.java.javalessons.oop.june13.Person;

/**
 * Created by: Hmayak on Jun, 2021
 */
public class Main {
    public static void main(String[] args) {

        Address address = new Address("Armenia", "Abovyan", "GArni 3", 2202);
        Address workAddress = new Address("Armenia", "Yerevan", "Armenakyan 2/2", 7777);
        Company company = new Company("Webbfonatine", workAddress);
        Job job = new Job("QA", company, 700000);
//        Person person = new Person(18, "Hamo", address, job);

//        System.out.println(person.getCompanyName());
//
//        System.out.println(person);

//        for (int i = 0; i < DataRepo.data.length ; i++) {
//            System.out.println(DataRepo.data[i].toString());
//        }

        for (Person p  : DataRepo.data) {
            System.out.println(p.toString());
        }
    }
}
