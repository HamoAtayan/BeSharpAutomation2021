package com.Besharp.java.javalessons.oop.june13;

import com.Besharp.java.javalessons.oop.june13.person.Address;
import com.Besharp.java.javalessons.oop.june13.person.Job;
import com.Besharp.java.javalessons.oop.june13.person.UserType;

/**
 * Created by: Hmayak on Jun, 2021
 */
public class Person {
    private final int age;
    private final String name;
    private final Address address;
    private final Job job;
    private UserType userType;

    public Person(int age, String name, Address address, Job job, UserType userType) {
        this.age = age;
        this.name = name;
        this.address = address;
        this.job = job;
        this.userType = userType;
    }

    public String getCompanyName() {
        return job.getCompany().getName();
    }

    public String toString() {
        return String.format("%d, %s, %s, %s, %s", age, name, address, job, userType.getPriority());
    }
}
