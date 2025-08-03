package org.example.sevice;

import lombok.Getter;
import org.example.model.Management;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Getter
public class ManagementService {
    List<Management> managers = new ArrayList<>();

    public void addManagers(String name, String role, int age, String address, String id, String department) {
        managers.add(new Management(name, department, id, address, age, role));
    }

    public Optional<Management> getManagerById(String id) {
        return managers.stream()
                .filter(manager -> manager.getId().equals(id))
                .findFirst();
    }

}
