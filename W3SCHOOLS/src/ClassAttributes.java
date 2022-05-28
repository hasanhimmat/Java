public class ClassAttributes {
	int income = 10; //attributes
	
	public static void main(String[] args) {
		// Java class attributes
		System.out.println("Java class attributes\n=====");
		
		// object // access and modify attribute
		ClassAttributes obj = new ClassAttributes();
		// obj.income = 100;
		
		ClassAttributes obj1 = new ClassAttributes();
		obj1.income = 1200000;
		
		
		// output
		System.out.println(obj.income);
		System.out.println(obj1.income);
		
		// Note: You can access attributes by creating an object of the class, and by using the dot syntax (.):

	}

}
