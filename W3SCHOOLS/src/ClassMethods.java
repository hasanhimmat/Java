public class ClassMethods {

	public static void main(String[] args) {
		// Java class methods
		System.out.println("Java class methods\n=====");

		// static method call
		myStaticMethod();

		// public method call
		// Note: Access Methods With an Object
		ClassMethods publicMethodObj = new ClassMethods();
		publicMethodObj.myPublicMethod();

		OutSideMethod.run();

	}

	// static method
	static void myStaticMethod() {
		System.out.println("This is simple static method!");
	}

	// public method
	public void myPublicMethod() {
		System.out.println("Public methods must be called by creating objects");
	}

}

// outside method
class OutSideMethod {
	public static void run() {
		System.out.println("\nOutside method call success!");
	}
}
