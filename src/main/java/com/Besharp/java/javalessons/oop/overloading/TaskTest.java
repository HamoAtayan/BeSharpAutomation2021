package com.Besharp.java.javalessons.oop.overloading;

public class TaskTest {
    public static void main(String[] args) {
        int h = Task.staticCount;
        Task task1 = new Task();
        Task task2 = new Task();
        Task task3 = new Task();
        Task task4 = new Task();
        Task task10 = new Task();

        int i = Task.staticCount;
        int j = new Task().count;
//        int l = new Task();

    }
}
