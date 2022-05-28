import java.util.Scanner;

public class Exceptions {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// Java Exceptions - Try...Catch
		try {
			System.out.print("Enter a number\nAns: ");
			int num = sc.nextInt();
			String result = num % 2 == 0 ? "Even" : "Odd";
			System.out.println(result);
		}catch (Exception e) {
			System.out.println("Please enter a number");
		}
		
	}

}
