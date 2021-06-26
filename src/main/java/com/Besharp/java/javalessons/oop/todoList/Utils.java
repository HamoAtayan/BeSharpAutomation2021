package com.Besharp.java.javalessons.oop.todoList;

/**
 * Created by: Hmayak on Nov, 2019
 */
public class Utils {
    private Utils() {
    }

    public static Task[] objectWithoutNull(Task[] tasks) {

        int lenght = 0;
        for (Task task : tasks) {
            if (task != (null)) {
                lenght++;
            }
        }
        Task[] objectWithoutNull = new Task[lenght];
        for (int i = 0; i < tasks.length; i++) {
            int j = 0;
            for (Task o : tasks
            ) {
                if (o != null) {
                    objectWithoutNull[j++] = o;
                }
            }
        }
        return objectWithoutNull;
    }
}
