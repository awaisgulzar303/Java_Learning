package org.example.sevice;

import org.example.model.Teacher;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class TeacherService {
    List<Teacher> teachers = new ArrayList<>();


    public void addTeacher(String name, String subject, int age, String address, String id) {
        teachers.add(new Teacher(name, age, address, subject, id));
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public Optional<Teacher> getTeacherById(String id) {
        return teachers.stream()
                .filter(teacher -> teacher.id().equals(id))
                .findFirst();
    }

}
//Teacher t1 = new Teacher("Waqas", 33, "lahore", "PF", "eew222");
//Teacher t2 = new Teacher("Aizaz", 33, "lahore", "OOP", "eew232");
//Teacher t3 = new Teacher("Waqas", 33, "lahore", "Math", "eew2242");
//Teacher t4 = new Teacher("Aizaz", 33, "lahore", "DSA", "eew2232");