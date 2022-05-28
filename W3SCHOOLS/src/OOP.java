public class OOP {
	public static void main(String[] args) {
		// Java OOP
		System.out.println("Object-Oriented Programming\n=====");

		// output
		Human.sayHi();
		Human.eating();
	}

	// inner class
	public class Human {
		// method 1
		public static void sayHi() {
			System.out.println("Assalamu alaicum");
		}

		// method 2
		public static void eating() {
			System.out.println("I am eating");
		}

	}
}