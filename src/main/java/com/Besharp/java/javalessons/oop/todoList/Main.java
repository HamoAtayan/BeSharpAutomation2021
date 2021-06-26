package com.Besharp.java.javalessons.oop.todoList;

/**
 * Created by: Hmayak on Nov, 2019
 * 1-get tasks by status
 * 2-get tasks by priority
 * 3-get tasks by due date
 * 4-delete all "done" tasks from the main array
 * 5-get task for engineer
 */
public class Main {
    public static void main(String[] args) {
//        for (Engineer e : EngineerRepo.get()
//        ) {
//            System.out.println(e.toString());
//        }

        for (Task task : ToDoListApi.getUnassignedTasks(TaskRepo.get())) {
            System.out.println(task);
        }
        System.out.println("--------------");

        for (Task task : TaskApi.getTaskByStatus(TaskRepo.get(), Status.TODO)
        ) {
            System.out.println(task.getStatus());
        }

        System.out.println("----------------");

        for (Task task : TaskApi.getTaskByPriority(TaskRepo.get(), Priority.HIGH)
        ) {
            System.out.println(task.getPriority());
        }

        System.out.println("-----------------");

        for (Task task : TaskApi.getTaskByDueDate(TaskRepo.get(), "2019-12-31")
        ) {
            System.out.println(task.getDueDate());
        }

        System.out.println("------------------");

        for (Task task : TaskApi.deleteDoneTasks(TaskRepo.get())
        ) {
            System.out.println(task);
        }

        System.out.println("-----------------");
        for (Task task : TaskApi.getTasksForEngineers(TaskRepo.get())) {
            System.out.println(task);
        }
    }
}
