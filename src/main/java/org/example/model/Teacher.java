package org.example.model;

public class Teacher extends Employee {
    private String subject;


    public Teacher(String name, String department, String id, String address, int age, String subject) {
        super(name, department, id, address, age);
        this.subject = subject;
    }


    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
