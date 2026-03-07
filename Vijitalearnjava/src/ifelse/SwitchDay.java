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
	case  4:
		System.out.println("Today is saturday");
		break;
	case  5:
		System.out.println("Today is wednesday");
		break;
	case  6:
		System.out.println("Today is thursday");
		break;
	case  7:
		System.out.println("Today is friday");
		break;
	default:
		System.out.println("you are an alien!!");
	
		}
	}
	
	public static void main (String[]args) {
		
		int num = 0;
		SwitchDay week = new SwitchDay();
		week.printdayoftheweek(num);
	}
}
