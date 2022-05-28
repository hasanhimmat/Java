import java.util.Scanner;

//0039
public class UserInputScanner {
    // Scanner
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // Java User Input (Scanner)
        System.out.println("===== Java User Input (Scanner) =====");

        // name input field
        System.out.print("Enter your name\nAnswer: ");
        String name = sc.nextLine();

        // age input field
        System.out.print("Enter your age\nAnswer: ");
        int age = sc.nextInt();

        // output
        System.out.println("\n===== input result =====");
        System.out.println("My name is: " + name);
        System.out.println("My age is: " + age);
    }
}
