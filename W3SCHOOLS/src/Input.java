import java.util.Scanner;

public class Input {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// java input
		System.out.println("Input your info\n=====");
		
		// first name
		System.out.print("Enter your first name\nAnswer: ");
		String fname = sc.nextLine();
		
		// last name
		System.out.print("\nEnter your last name\nAnswer: ");
		String lname = sc.nextLine();

		// separator
		System.out.println("\n===== Full name =====");
		
		// output
		System.out.println("My name is " + fname.concat(" " + lname));
	}

}
