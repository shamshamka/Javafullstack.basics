package com.yourname.assignment;

import employees.*;
import utilities.EmployeeUtilities;


public class AssignmentMain {
    public static void main(String[] args) {
        // Create Manager and Developer objects
        Manager manager = new Manager("Alice", 101, 75000, "HR");
        Developer developer = new Developer("Bob", 102, 60000, "Java");

        // Create EmployeeUtilities object
        EmployeeUtilities utils = new EmployeeUtilities();

        System.out.println("--- Manager Details ---");
        utils.displayDetails(manager);

        System.out.println("\n--- Developer Details ---");
        utils.displayDetails(developer);

        // Increase salary
        System.out.println("\n--- Increasing Salaries ---");
        utils.increaseSalary(manager, 10);
        utils.increaseSalary(developer, 15);

        System.out.println("\n--- Updated Manager Details ---");
        utils.displayDetails(manager);

        System.out.println("\n--- Updated Developer Details ---");
        utils.displayDetails(developer);
    }
}
