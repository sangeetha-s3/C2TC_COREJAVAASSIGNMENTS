package com.tnsif.assignmentone.utilities;


import com.tnsif.assignmentone.employees.Employee;

/**
 * The EmployeeUtilities class provides utility methods to
 * operate on Employee objects.
 */
public class EmployeeUtilities {

    // Method to give bonus
    public static void giveBonus(Employee emp, double bonusAmount) {
        double newSalary = emp.getSalary() + bonusAmount;
        System.out.println("Bonus of " + bonusAmount + " added to " + emp.getName());
        System.out.println("New Salary: " + newSalary);
    }

    // Method to display employee info using polymorphism
    public static void showEmployeeDetails(Employee emp) {
        emp.displayInfo();
    }
}

