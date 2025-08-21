package employees;

public class Manager extends Employee {
    private String department;

    // Constructor
    public Manager(String name, int employeeId, double salary, String department) {
        super(name, employeeId, salary);
        this.department = department;
    }

    // Getter and Setter
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    // Display Manager details
    @Override
    public void displayEmployeeInfo() {
        super.displayEmployeeInfo();
        System.out.println("Department: " + department);
    }
}
