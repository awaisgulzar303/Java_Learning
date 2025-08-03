package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public abstract class Employee {
    private String name;
    private String department;
    private String id;
    private String address;
    private int age;
}
