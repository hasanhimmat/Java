import java.util.Scanner;

//0010
public class Input {
    // scanner
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        // Java Inputs
        System.out.println("===== Java Inputs =====\n");

        System.out.print("Enter first name\nAns: ");
        String fname = sc.nextLine().toLowerCase();

        System.out.print("Enter last name\nAns: ");
        String lname = sc.nextLine().toLowerCase();

        // result
        System.out.println("\n***** Result *****");
        // process text
        String firstName = fname.substring(0, 1).toUpperCase() + fname.substring(1);
        String lastName = lname.substring(0, 1).toUpperCase() + lname.substring(1);
        System.out.println("My name is " + firstName.concat(" " + lastName));



    }
}
