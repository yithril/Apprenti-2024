package org.example;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Harry Potter", "Engineer", "ABC123", 10);

        Employee secondEmployee = new Employee("Johnny New Employee", "Teller", "123");

        System.out.println(employee.toString());

        Employee thirdEmployee = new Employee("Joe", "Firefighter");

        System.out.println(thirdEmployee.getEmployeeId());

        System.out.println(secondEmployee.getYearsOfService());

        System.out.printf("Name: %s Position: %s EmployeeId: %s Years Employed: %d %n", employee.getName(), employee.getPosition(), employee.getEmployeeId(), employee.getYearsOfService());

        Company company = new Company("Hop Inc.", "Finance", employee);

        System.out.printf("Company Name: %s Industry: %s Employee Of The Month: %s",
                company.getCompanyName(), company.getIndustry(), company.getEmployeeOfTheMonth().getName());
    }
}