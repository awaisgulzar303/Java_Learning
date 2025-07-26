package org.example;

public class Student extends Person {




    private String grade;

    public Student(String name, int age, String address, String grade) {
        super(name, age, address);
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

