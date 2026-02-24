package myproject;

public class Hello {
	
	public static void main (String[] args) {
		System.out.println("How Are You?");
		
		//Hello hi = new Hello();
		
		//hi.Hey();
		
		Hello my= new Hello();
				my.Mood();
;		
		//Life();
		
	}
	
	public void Hey() {

		System.out.println("I Am Good");
		Life();
		
		}
	
	public static void Life() {
		System.out.println("Life is good.");
	}
	
    public void Mood() {
    	System.out.println("Amazing");
    	
    	Hey();
    	
    	
    }
}
