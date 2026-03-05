package ifelse;

public class StudentMarks {

	// Write a Java program that:

	// Takes a student's marks as input.
	// If marks are 40 or above, print "Pass".
	// Otherwise, print "Fail".



	public void mymarks() {
		
		int marks = 20;
				

		if (marks>40) {
			System.out.println("Pass");
		}

		else {
			System.out.println("Fail");
		}
	}

	public static void main(String[] args) {
		StudentMarks sm = new StudentMarks();
		sm.mymarks();

	}

}
