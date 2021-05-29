package com.Besharp.java.javalessons.objects;

/**
 * Created by Hmayak on 18, May, 2021.
 */
public class PersonTest {

    public static void main(String[] args) {

        Person valentina = new Person("Valentina", 23);
        Person kristina = new Person("Kristina", 23);
        Person hamo = new Person("hamo", 30);
        Person tiko = new Person("tiko", 40);

        Person tiko2 = new Person();
        tiko2.walk("arag");

        Person Hamo = new Person(30,"Artur");

        Person[] personsArray = new Person[4];
        personsArray[0] = valentina;
        personsArray[1] = kristina;
        personsArray[2] = hamo;
        personsArray[3] = tiko;

        int max = 0;
        String theOldestName = "";

        for (int i = 0; i < personsArray.length; i++) {
            if (personsArray[i].age > max) {
                max = personsArray[i].age;
                theOldestName = personsArray[i].name;

            }
        }
        System.out.println("the oldest person is " + theOldestName + " with the age of: " + max);


    }
}
