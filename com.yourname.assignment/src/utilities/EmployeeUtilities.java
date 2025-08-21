package utilities;

import employees.Employee;

/**
 * The EmployeeUtilities class provides utility methods
 * to work with Employee objects.
 */
public class EmployeeUtilities {

    /**
     * Increases the salary of the given employee by a percentage.
     * @param emp Employee object
     * @param percentage percentage increase
     */
    public void increaseSalary(Employee emp, double percentage) {
        double newSalary = emp.getSalary() + (emp.getSalary() * percentage / 100);
        emp.setSalary(newSalary);
        System.out.println("Salary updated successfully!");
    }

    /**
     * Display details of the employee
     * @param emp Employee object
     */
    public void displayDetails(Employee emp) {
        emp.displayEmployeeInfo();
    }
}
