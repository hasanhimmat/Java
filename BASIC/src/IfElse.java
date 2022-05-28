import java.util.Scanner;

//0011
public class IfElse {
    // scanner
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        // Java If ... Else
        System.out.println("===== Java If ... Else =====\n");


        // variable
        System.out.print("Enter husband age\nAns: ");
        int husbandAge = sc.nextInt();

        System.out.print("Enter wife age\nAns: ");
        int wifeAge = sc.nextInt();

        // condition
        if (husbandAge > wifeAge) {
            int diff = husbandAge - wifeAge;
            System.out.println("\nHasband is Senior\nAge diff: " + diff);
        } else if (husbandAge == wifeAge) {
            System.out.println("\nHasband & Wife age is same");
        } else {
            int diff = wifeAge - husbandAge;
            System.out.println("\nWife is Senior\nAge diff: " + diff);
        }
    }


}
