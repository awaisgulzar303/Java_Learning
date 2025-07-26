package org.example;

public class Student extends Person {



    private String id;
    private String grade;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Student(String name, int age, String address, String id, String grade) {
        super(name, age, address);
        this.id = id;
        this.grade = grade;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }


    public void studentInfo() {
        System.out.println("My name is " + getName()+"." + "I am from " + getAddress() + "." +"I am "+getAge()+" years old"+"My gardes in unoversity are "+getGrade());
    }
}

