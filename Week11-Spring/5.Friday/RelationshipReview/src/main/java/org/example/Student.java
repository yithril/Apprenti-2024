package org.example;

import java.util.List;

public class Student {
    private String name;
    private List<Course> courses; // Many-to-many relationship

    public Student(String name, List<Course> courses) {
        this.name = name;
        this.courses = courses;
    }

    // Getters
    public String getName() {
        return name;
    }

    public List<Course> getCourses() {
        return courses;
    }
}