import java.util.Scanner;

//0013
public class WhileLoop {
    // scanner
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // output
        System.out.println("===== Java While Loop =====\n");

        System.out.print("Enter a value 1 - 50\nAns: ");
        int number = sc.nextInt();

        while (number <= 50) {
            System.out.println(number + ": print success");
            number++;
        }

    }
}
