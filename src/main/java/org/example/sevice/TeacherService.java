package org.example.sevice;

import org.example.model.Teacher;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class TeacherService {
    List<Teacher> teachers = new ArrayList<>();


    public void addTeacher(String name, String subject, int age, String address, String id, String department) {
        teachers.add(new Teacher(name, department, id, address, age, subject));
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public Optional<Teacher> getTeacherById(String id) {
        return teachers.stream()
                .filter(teacher -> teacher.getId().equals(id))
                .findFirst();
    }

}
