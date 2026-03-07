package ifelse;

public class TernoryOperator {
	
public void mymarks() {
		
		int marks = 10;
				
		//if (marks>40) {
			//System.out.println("Pass");
		//}

		//else {
			//System.out.println("Fail");
	
	
		String mymarks1 = (marks>40)?"Pass":"Fail";
		System.out.println(mymarks1);
	
	}

	public static void main (String[]args) {
		
		TernoryOperator sm = new TernoryOperator();
		sm.mymarks();
	}
}


