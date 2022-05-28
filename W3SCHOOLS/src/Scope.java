public class Scope {

	public static void main(String[] args) {
		// Java scope
		System.out.println("Java scope\n=====");

		String name = "Hasanur Rahman";
		int age = 21;

		System.out.println("My name is " + name);
		System.out.println("My age is " + age);

		// Code here CANNOT use x

		{ // This is a block

			// Code here CANNOT use x

			int x = 100;

			// Code here CAN use x
			System.out.println("\n" + x + "\n");

		} // The block ends here

		// Code here CANNOT use x

		// output
		Human.sayHi();
		Animal.info();

	}

	// inner class
	public class Human {
		// method
		public static void sayHi() {
			System.out.println("Assalamu alicum");
		}
	}

}

// outside class
class Animal {
	// method
	public static void info() {
		System.out.println("This is cat\n");
	}
}
