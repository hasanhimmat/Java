public class SwitchCase {
	public static void main(String[] args) {
		// Switch case
		System.out.println("Java switch\n=====");
		
		// number
		int number = 12;
		int remaind = number % 2;
		
		// switch
		switch (remaind) {
		  case 0:
		    System.out.println(number + " is Even");
		    break;
		    
		  case 1:
		    System.out.println(number + " is Odd");
		    break;
		    
		    default:
		    	System.out.println("Something is worng!");
		}
	}
	
}
