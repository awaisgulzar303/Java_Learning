package org.example.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Teacher extends Employee {
    private String subject;

    public Teacher(String name, String department, String id, String address, int age, String subject) {
        super(name, department, id, address, age);
        this.subject = subject;
    }
}
