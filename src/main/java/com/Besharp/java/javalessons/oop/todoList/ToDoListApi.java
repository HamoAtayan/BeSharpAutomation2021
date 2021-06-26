package com.Besharp.java.javalessons.oop.todoList;

/**
 * Created by: Hmayak on Nov, 2019
 */
public class ToDoListApi {

    private ToDoListApi() {
    }

    public static Task[] getUnassignedTasks(Task[] tasks) {
        int j = 0;
        Task[] unassagniedTasks = new Task[tasks.length];
        for (Task task : tasks) {
            if (task.getAssignee().name.equals(Constants.UNASSIGNED)) {
                unassagniedTasks[j++] = task;
            }
        }
        return Utils.objectWithoutNull(unassagniedTasks);
    }


}
