package assignment.sales;
import java.util.Scanner;

public class Commission {
	private String name;
    private String address;
    private String phone;
    private double salesAmount;

    // Method (i): Accept details of the sales employee
    public void acceptDetails() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee Name: ");
        name = sc.nextLine();

        System.out.print("Enter Employee Address: ");
        address = sc.nextLine();

        System.out.print("Enter Employee Phone: ");
        phone = sc.nextLine();

        System.out.print("Enter Sales Amount: ");
        salesAmount = sc.nextDouble();
    }

    // Method (ii): Calculate commission
    public void calculateCommission() {
        double commission;

        if (salesAmount >= 100000) {
            commission = salesAmount * 0.10;
        } else if (salesAmount >= 50000) {
            commission = salesAmount * 0.05;
        } else if (salesAmount >= 30000) {
            commission = salesAmount * 0.03;
        } else {
            commission = 0;
        }

        // Display details
        System.out.println("\n--- Employee Commission Details ---");
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Phone: " + phone);
        System.out.println("Sales Amount: " + salesAmount);
        System.out.println("Commission: " + commission);
    }
}
