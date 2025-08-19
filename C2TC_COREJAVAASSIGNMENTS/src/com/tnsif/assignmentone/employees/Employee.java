package com.tnsif.assignmentone.employees;

/**
 * The Employee class represents a general employee with
 * attributes name, employeeId, and salary.
 */
public class Employee {
    private String name;
    private int employeeId;
    private double salary;

    // Constructor
    public Employee(String name, int employeeId, double salary) {
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    protected void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public double getSalary() {
        return salary;
    }

    protected void setSalary(double salary) {
        this.salary = salary;
    }

    // Display method
    public void displayInfo() {
        System.out.println("Name: " + name + ", ID: " + employeeId + ", Salary: " + salary);
    }
}
