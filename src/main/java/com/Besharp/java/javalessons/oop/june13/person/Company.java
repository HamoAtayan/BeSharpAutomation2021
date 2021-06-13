package com.Besharp.java.javalessons.oop.june13.person;

/**
 * Created by: Hmayak on Jun, 2021
 */
public class Company {
    private String name;
    private Address address;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public Company(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("%s, %s", name, address);
    }

}
