public class Constructors {
	// properties or attributes
	String name;
	int age;

	// constructors
	public Constructors(String userName, int userAge) {
		this.name = userName;
		this.age = userAge;

		// System.out.println("My name is " + userName);
		// System.out.println("My age is " + userAge);

	}

	public static void main(String[] args) {
		// Java constructors
		System.out.println("Java constructors\n=====");

		// output
		Constructors magic = new Constructors("Hasan", 21);
		System.out.printf("My name is %s\nMy age is %d", magic.name, magic.age);

	}

}

//Outputs 5