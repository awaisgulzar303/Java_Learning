package org.example.sevice;

import lombok.Getter;
import org.example.model.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Getter
public class StudentService {
    List<Student> students = new ArrayList<>();

    public void createStudent(String name, int age, String address, String id) {
        students.add(new Student(name, age, address, id));
    }

    public Optional<Student> getStudentById(String id) {
        return students.stream().filter(n -> n.id().equals(id)).findFirst();
    }
}
