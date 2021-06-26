package com.Besharp.java.javalessons.oop.todoList;

/**
 * Created by: Hmayak on Nov, 2019
 */
public class Engineer {
    protected String name;
    private Role role;

    public Engineer(String name, Role role) {
        this.name = name;
        this.role = role;
    }

    public Engineer() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Role getRole() {
        return role;
    }

    @Override
    public String toString() {
        return String.format("name: %s, role: %s", name, role);
    }
}
