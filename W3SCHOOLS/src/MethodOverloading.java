
public class MethodOverloading {

	public static void main(String[] args) {
		//  Method overloading
		System.out.println(" Method overloading\n=====");
		
		// output
		whatIs();
		whatIs("Hasan");
		whatIs(5);
		
	}

	// method
	public static void whatIs() {
		System.out.println("This is method");
	}

	public static void whatIs(String name) {
		System.out.println("This is " + name);
	}
	
	public static void whatIs(int number) {
		System.out.println(number + " Bum​ blust🔥​🔥​🔥");
	}
	// note: multiple methods can have the same name with different parameters:
	

}
