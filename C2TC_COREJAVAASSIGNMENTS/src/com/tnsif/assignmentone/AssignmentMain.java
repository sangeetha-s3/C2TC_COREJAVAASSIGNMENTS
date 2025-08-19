package com.tnsif.assignmentone;

import com.tnsif.assignmentone.employees.*;
import com.tnsif.assignmentone.utilities.EmployeeUtilities;

/**
 * Main class to demonstrate the usage of packages and access modifiers.
 */
public class AssignmentMain {
    public static void main(String[] args) {
        
        // Create Manager and Developer objects
        Manager mgr = new Manager("Alice", 101, 80000, "HR");
        Developer dev = new Developer("Bob", 102, 60000, "Java");

        // Use utility methods
        EmployeeUtilities.showEmployeeDetails(mgr);
        EmployeeUtilities.giveBonus(mgr, 5000);

        System.out.println("------------------");

        EmployeeUtilities.showEmployeeDetails(dev);
        EmployeeUtilities.giveBonus(dev, 3000);
    }
}

