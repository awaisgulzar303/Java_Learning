package org.example.model;

import java.util.List;

public record University(
        String name,
        String location,
        List<Student> students,
        List<Teacher> teacher) {
    public static final University INSTANCE =
            new University("University of Management", "PK", List.of(), List.of());
}



