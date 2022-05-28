import java.util.Scanner;

//0014
public class DoWhile {
    // scanner
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        // Do/While Loop
        System.out.println("===== Do/While Loop =====\n");

        System.out.print("Enter your salary \n$: ");
        int salary = sc.nextInt();

        int total = salary / 1000;

        do {
            System.out.println(total + " marriage success");
            total--;
        } while (total >= 1);

    }
}
