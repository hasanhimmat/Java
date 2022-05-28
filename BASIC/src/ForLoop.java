import java.util.Scanner;

//0015
public class ForLoop {
    // scanner
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // output
        System.out.println("===== Java For Loop =====\n");

        System.out.print("Enter a value 1 - 50\nAns: ");
        int number = sc.nextInt();

        for (int i = number; i <= 50; i++) {
            System.out.println(i + ": print success");
        }

    }
}