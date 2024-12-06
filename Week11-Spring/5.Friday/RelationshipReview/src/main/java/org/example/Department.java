package org.example;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private String departmentName;
    private List<Employee> employees = new ArrayList<>();

    public Department(String departmentName) {
        this.departmentName = departmentName;
    }

    // Getter
    public String getDepartmentName() {
        return departmentName;
    }

    public void addEmployee(Employee e){
        this.employees.add(e);
    }

    public List<Employee> getEmployees() {
        return employees;
    }
}

