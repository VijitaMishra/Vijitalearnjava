package loops;

public class ForLoop {
	
	public static void main(String[]args) {
		
		int i;
	
	for( i=0;i < 7;i++) {
		System.out.println("value of i = "+ i);
		//continue;
		
		if(i==5) {
			continue;
			//System.out.println("Number is 5");
			//break;
		}
		System.out.println("Number is 5");
	}
   }
}
