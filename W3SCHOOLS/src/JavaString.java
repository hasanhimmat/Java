public class JavaString {

	public static void main(String[] args) {
		// string
		String name = "Hasan Himmat";
		
		String fname = "Hasanur";
		String lname = "Rahman";
		
		// String method
		System.out.println("My name is " + name);
		
		System.out.println("Length is " + name.length());
		
		System.out.println(name.toLowerCase());
		
		System.out.println(name.toUpperCase());
		
		System.out.println(name.toCharArray()[0]);
		
		System.out.println(name.indexOf("Himmat"));
		
		System.out.println("My real name " + fname + " " + lname);
		
		System.out.println(fname.concat(" " + lname));

	}

}
