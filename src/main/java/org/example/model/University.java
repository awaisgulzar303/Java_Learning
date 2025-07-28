package org.example.model;

import java.util.List;

public class University {
    private String name;
    private String location;
    private List<Student> students;
    private List<Teacher> teacher;

    private List<CourseRecord> course;

    public University(String name, String location, List<Student> students, List<Teacher> teacher, List<CourseRecord> course) {
        this.name = name;
        this.location = location;
        this.students = students;
        this.teacher = teacher;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public List<Teacher> getTeacher() {
        return teacher;
    }

    public void setTeacher(List<Teacher> teacher) {
        this.teacher = teacher;
    }


    public List<CourseRecord> getCourse() {
        return course;
    }

    public void setCourse(List<CourseRecord> course) {
        this.course = course;
    }


}
