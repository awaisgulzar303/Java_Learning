package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@Getter
@AllArgsConstructor
public class University {
    private static University instance;

    private final String name;
    private final String location;
    private final List<Student> students;
    private final List<Employee> employees;

    public static void initialize(String name, String location, List<Student> students, List<Employee> employees) {
        if (instance == null) {
            instance = new University(name, location, students, employees);
        }
    }

    public static University getInstance() {
        if (instance == null) {
            throw new IllegalStateException("University not initialized. Call initialize() first.");
        }
        return instance;
    }
}

