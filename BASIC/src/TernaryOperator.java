import java.util.Scanner;

//0012
public class TernaryOperator {
    // scanner
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // Ternary Operator
        System.out.println("===== Java Short Hand If...Else (Ternary Operator) =====\n");

        System.out.print("Enter a number\nAns: ");
        int number = sc.nextInt();

        String result = (number % 2 == 0) ? number + " is even number" : number + " odd number";

        // result
        System.out.println("\n***** Result *****");
        System.out.println(result);
    }
}
