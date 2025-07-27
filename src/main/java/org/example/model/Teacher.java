package org.example.model;

public class Teacher extends Person {

    private String subject;
    private String id;

    public Teacher(String name, int age, String address, String subject, String id) {
        super(name, age, address);
        this.subject = subject;
        this.id = id;
    }

    public String getSubject() {
        return subject;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "subject='" + subject + '\'' +
                ", id='" + id + '\'' +
                "} " + super.toString();
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
