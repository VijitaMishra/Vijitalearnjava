package controlstatement;

public class Ifelseblock {
	
	boolean itRains= true;
	
	public void myAction(){
		
		if(itRains) {
			System.out.println("Take a cab");		
		}
		else {
			System.out.println("I will walk to the office");
		}
		
	}
	public static void main (String[] args) {
		
		Ifelseblock ie = new Ifelseblock();
		ie.myAction();
		
	}

}
