package org.example.model;

public class Management extends Employee {
    private String role;

    public Management(String name, String department, String id, String address, int age, String role) {
        super(name, department, id, address, age);
        this.role = role;
    }

}
