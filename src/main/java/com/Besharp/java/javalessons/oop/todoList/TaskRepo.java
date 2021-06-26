package com.Besharp.java.javalessons.oop.todoList;

import java.time.LocalDate;

/**
 * Created by: Hmayak on Nov, 2019
 */
public class TaskRepo {
    private static Task[] tasks = new Task[5];

    private TaskRepo() {
        //empty private require constructor for avoiding new instance creation
    }

    static {
        tasks[0] = new Task("Homeworks", "Required for future", Priority.HIGH, LocalDate.of(2019, 12, 31));
        tasks[1] = new Task("Classworks", "also required ", Priority.HIGH, LocalDate.now(),
                LocalDate.of(2019, 12, 31), EngineerRepo.get()[0], "java", Status.TODO);
        tasks[2] = new Task("Workout", "also required ", Priority.lOW, LocalDate.now(),
                LocalDate.of(2019, 12, 31), EngineerRepo.get()[1], "java", Status.IN_PROGRESS);
        tasks[3] = new Task("In room", "also required ", Priority.MEDIUM, LocalDate.now(),
                LocalDate.of(2019, 12, 31), EngineerRepo.get()[2], "java", Status.TECH_REVIEW);
        tasks[4] = new Task("Homework", "also required ", Priority.HIGH, LocalDate.now(),
                LocalDate.of(2019, 12, 31), EngineerRepo.get()[2], "qa", Status.DONE);
    }

    public static Task[] get() {
        return tasks;
    }


}

