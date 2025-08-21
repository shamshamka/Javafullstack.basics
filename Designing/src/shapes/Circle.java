package shapes;
import java.util.Scanner;
public class Circle {
	  private double radius;
	    private String colour;

	    // Method (i): Accept circle details
	    public void getInput() {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter radius of circle: ");
	        radius = sc.nextDouble();
	        sc.nextLine(); // consume newline

	        System.out.print("Enter colour of circle: ");
	        colour = sc.nextLine();
	    }

	    // Method (ii): Calculate and display area
	    public void calcArea() {
	        double area = Math.PI * radius * radius;
	        System.out.println("\n--- Circle Details ---");
	        System.out.println("Radius: " + radius);
	        System.out.println("Colour: " + colour);
	        System.out.println("Area: " + area);
	    }
	
}
