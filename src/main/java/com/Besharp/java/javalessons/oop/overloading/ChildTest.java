package com.Besharp.java.javalessons.oop.overloading;

public class ChildTest {
    public static void main(String[] args) {
        Parent child = new Child();
//        Child child = new Parent(); senc ban chi kara lini
        AshxuyzChild ashxuyzChild = new AshxuyzChild();
        Parent ashxuyzChild2 = new AshxuyzChild();
        ParentiPapa ashxuyzChild3 = new AshxuyzChild();

        child.walk();
        ashxuyzChild.walk();
        ashxuyzChild.test();
        ashxuyzChild2.walk();
        ashxuyzChild3.esiminch();
    }
}
