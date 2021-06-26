package com.Besharp.java.javalessons.oop.abstraction;

public class Hamik implements OnePlanetContract, TechnicalSkills {

    private int age;
    private String name;
    String proffestion;
    public Hamik(int age, String name, String proffestion) {
        this.age = age;
        this.name = name;
        this.proffestion = proffestion;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getProffestion() {
        return proffestion;
    }

    @Override
    public void salary() {
        System.out.println("500000$");
    }

    @Override
    public void workLog() {
        System.out.println("liqy gorcem arel");
    }

    @Override
    public void vacationBalance() {
        System.out.println("20 days left");
    }

    @Override
    public void thirteenSalary() {
       TechnicalSkills.super.thirteenSalary();
    }

    @Override
    public void work() {
        OnePlanetContract.super.work();
    }

    @Override
    public void automationSkkills() {

    }

    @Override
    public void codingSkills() {

    }

    @Override
    public void dbSkills() {

    }

    @Override
    public void apiSkills() {

    }


    @Override
    public String toString() {
        return "Hamik{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", proffestion='" + proffestion + '\'' +
                '}';
    }
}
