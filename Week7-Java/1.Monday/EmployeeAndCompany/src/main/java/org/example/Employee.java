package org.example;

public class Employee {
    private String name;
    private String position;
    private String employeeId;
    private int yearsOfService;

    public Employee(String name, String position, String employeeId, int yearsOfService) {
        this.name = name;
        this.position = position;
        this.employeeId = employeeId;
        this.yearsOfService = yearsOfService;
    }

    public Employee(String name, String position, String employeeId) {
        this.name = name;
        this.position = position;
        this.employeeId = employeeId;
        this.yearsOfService = 0;
    }

    public Employee(String name, String position) {
        this.name = name;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public int getYearsOfService() {
        return yearsOfService;
    }

    public void setYearsOfService(int yearsOfService) {
        this.yearsOfService = yearsOfService;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", employeeId='" + employeeId + '\'' +
                ", yearsOfService=" + yearsOfService +
                '}';
    }
}
