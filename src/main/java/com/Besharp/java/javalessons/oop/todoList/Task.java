package com.Besharp.java.javalessons.oop.todoList;

import java.time.LocalDate;

/**
 * Created by: Hmayak on Nov, 2019
 */
public class Task {
    private String name;
    private String description;
    private Priority priority;
    private LocalDate startDate;
    private LocalDate dueDate;
    private Engineer assignee;
    private String label;
    private Status status;

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public Engineer getAssignee() {
        return assignee;
    }

    public void setAssignee(Engineer assignee) {
        this.assignee = assignee;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public Priority getPriority() {
        return priority;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Task(String name, String description, Priority priority, LocalDate dueDate) {
        this.name = name;
        this.description = description;
        this.priority = priority;
        this.dueDate = dueDate;

        //Default initialization

        this.status = Status.TODO;
        this.startDate = LocalDate.now();
        this.assignee = Unassigned.getInstance();
    }

    public Task(String name, String description, Priority priority, LocalDate startDate,
                LocalDate dueDate, Engineer assignee, String label, Status status) {
        this.name = name;
        this.description = description;
        this.priority = priority;
        this.startDate = startDate;
        this.dueDate = dueDate;
        this.assignee = assignee;
        this.label = label;
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return String.format("name: %s, description: %s, priority: %s," +
                " startDate: %s, localDate: %s, assignee: %s, label: %s, status: %s",name,description,priority,
                startDate.toString(),dueDate.toString(),assignee,label,status);
    }
}
