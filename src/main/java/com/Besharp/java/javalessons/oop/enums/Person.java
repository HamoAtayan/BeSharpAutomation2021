package com.Besharp.java.javalessons.oop.enums;

public enum Person {
    VALENTINA("Valentina", 23, 1000000, "QA"),
    ARTHUR("Arthur", 25, 100000, "QA looking for job"),
    TIGRAN("Tigran", 24, 250000, "Tester"),
    CHRISTINA("Christina", 30, 2000000, "Qa Intern"),
    HAMIK("Hamik", 25, 400000, "Testirovshik");

    private String name;
    private int age;
    private int salary;
    private String profession;

   private Person(String name, int age, int salary, String profession) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.profession = profession;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }

    public String getProfession() {
        return profession;
    }

    public String getName() {
        return name;
    }
}
