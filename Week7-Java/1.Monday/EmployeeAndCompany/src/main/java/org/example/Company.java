package org.example;

public class Company {
    private String companyName;
    private String industry;
    //Has-A relationship
    //A company has-a Employee
    private Employee employeeOfTheMonth;

    public Company(String companyName, String industry, Employee employeeOfTheMonth) {
        this.companyName = companyName;
        this.industry = industry;
        this.employeeOfTheMonth = employeeOfTheMonth;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public Employee getEmployeeOfTheMonth() {
        return employeeOfTheMonth;
    }

    public void setEmployeeOfTheMonth(Employee employeeOfTheMonth) {
        this.employeeOfTheMonth = employeeOfTheMonth;
    }
}
