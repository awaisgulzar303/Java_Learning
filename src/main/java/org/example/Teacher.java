package org.example;

public class Teacher extends Person{

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
