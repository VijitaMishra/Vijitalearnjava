package ifelse;

public class SwitchDay {
	
	//Day of the Week
	//Write a Java program that:
	//Takes a number from 1 to 7.
	//Use a switch statement to print the corresponding day of the week.

	//Example:
	//1 → Monday
	//2 → Tuesday
	//3 → Wednesday
	
	public void printdayoftheweek(int num){
	
		
	switch (num) {
	
	case  1:
		System.out.println("Today is sunday");
		break;
	case  2:
		System.out.println("Today is monday");
		break;
	case  3:
		System.out.println("Today is tuesday");
		break;
		}
	}
	
	public static void main (String[]args) {
		
		int num = 3;
		SwitchDay week = new SwitchDay();
		week.printdayoftheweek(num);
	}
}
