package yourname.assignment;
import assignment.student.Student;
import assignment.sales.Commission;
public class MainProgram {

	public static void main(String[] args) {
        // Create Student object (default constructor message will be printed)
        Student s = new Student();

        // Create Commission object and test methods
        Commission emp = new Commission();
        emp.acceptDetails();
        emp.calculateCommission();
    }
}


