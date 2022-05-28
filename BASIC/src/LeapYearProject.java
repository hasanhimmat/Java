import java.util.Scanner;

//0020
public class LeapYearProject {
    // scanner
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // Lear Year Project
        System.out.println("===== Leap Year Finder =====");

        System.out.print("Enter a year\nAns: ");
        int year = sc.nextInt();

        // condition
        System.out.println("\n===== Result =====");
        if (year % 400 == 0) {
            System.out.println(year + " is a Leap Year");
        } else if (year % 4 == 0 && year % 100 != 0) {
            System.out.println(year + " is a Leap Year");
        } else {
            System.out.println(year + " Not a Leap Year");
        }


        // short
        // year % 4 == 0 && $year % 100 != 0 || $year % 400 == 0
        if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
            System.out.println(year + " is a Leap Year");
        } else {
            System.out.println(year + " Not a Leap Year");
        }


    }
}
