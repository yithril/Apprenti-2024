package org.example;

public class Employee {
    private String name;
    private Department department; // Many-to-one relationship

    public Employee(String name, Department department) {
        this.name = name;
        this.department = department;
    }

    // Getters
    public String getName() {
        return name;
    }

    public Department getDepartment() {
        return department;
    }
}
