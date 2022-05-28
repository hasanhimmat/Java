import java.util.Scanner;

//0022
public class MethodParameters {
    // scanner
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // Method Parameters
        System.out.println("===== Method Parameters =====\n");

        System.out.print("Enter a number\nAns: ");
        int number = sc.nextInt();

        // method call
        System.out.println(WhatsNumber(number));

    }


    // even and ood finder method
    static String WhatsNumber(int number) {
        String result = number % 2 == 0 ? number + " is Even number" : number + " is Odd number";
        return result;
    }
}
