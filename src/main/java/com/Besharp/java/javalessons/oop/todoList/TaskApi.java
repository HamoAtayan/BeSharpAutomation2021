package com.Besharp.java.javalessons.oop.todoList;

/**
 * Created by: Hmayak on Nov, 2019
 */
public class TaskApi {

    public static Task[] getTaskByStatus(Task[] tasks, Status status) {
        Task[] getTaskByStatus = new Task[tasks.length];
        for (int i = 0; i < tasks.length; i++) {
            if (status == tasks[i].getStatus()) {
                getTaskByStatus[i] = tasks[i];
            }
        }
        return Utils.objectWithoutNull(getTaskByStatus);
    }

    public static Task[] getTaskByPriority(Task[] tasks, Priority priority) {
        Task[] getTaskByPriority = new Task[tasks.length];
        for (int i = 0; i < tasks.length; i++) {
            if (priority == tasks[i].getPriority()) {
                getTaskByPriority[i] = tasks[i];
            }
        }
        return Utils.objectWithoutNull(getTaskByPriority);
    }

    public static Task[] getTaskByDueDate(Task[] tasks, String dueDate) {
        Task[] getTaskByDueDate = new Task[tasks.length];
        for (int i = 0; i < tasks.length; i++) {
            if (dueDate.equals(tasks[i].getDueDate().toString())) {
                getTaskByDueDate[i] = tasks[i];
            }
        }
        return Utils.objectWithoutNull(getTaskByDueDate);
    }

    public static Task[] deleteDoneTasks(Task[] tasks) {

        Task[] tasksWithoutDone = new Task[tasks.length];
        for (int i = 0; i < tasks.length; i++) {
            if (tasks[i].getStatus() != Status.DONE) {
                tasksWithoutDone[i] = tasks[i];
            }
        }
        return Utils.objectWithoutNull(tasksWithoutDone);
    }

    public static Task[] getTasksForEngineers(Task [] tasks){
        Task [] enginnersTask = new Task[tasks.length];
        for (int i = 0; i < tasks.length ; i++) {
            for (Engineer engineer: EngineerRepo.get()) {
                if (tasks[i].getAssignee().getName().equals(engineer.name) ){
                    enginnersTask[i] = tasks[i];
                }
            }
        }
        return Utils.objectWithoutNull(enginnersTask);
    }
}
