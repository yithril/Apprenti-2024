package org.example;

import java.util.List;

public class Course {
    private String courseName;
    private List<Student> students; // Many-to-many relationship

    public Course(String courseName, List<Student> students) {
        this.courseName = courseName;
        this.students = students;
    }

    // Getters
    public String getCourseName() {
        return courseName;
    }

    public List<Student> getStudents() {
        return students;
    }
}