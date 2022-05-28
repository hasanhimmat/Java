public class MethodParameters {

	public static void main(String[] args) {
		// Method parameters
		System.out.println("Method parameters\n=====");

		// output
		whatIs(2);
		whatIs(9);
		whatIs(50);
		whatIs(35);
		whatIs(100);
	}

	
	// Method
	private static void whatIs(int number) {
		// switch case
		switch(number % 2) {
		case 0:
			System.out.println("This " + number +" is even number");
			break;
		case 1:
			System.out.println("This " + number +" is odd number");
			break;
		default:
			System.out.println("Something is worng");
		}
		
	}
	
}
