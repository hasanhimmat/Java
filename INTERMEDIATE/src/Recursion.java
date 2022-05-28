//0025
public class Recursion {
    public static void main(String[] args) {
        // Java Recursion
        System.out.println("===== Java Recursion =====\n");

        // reverse
        print(5);

        // factorial
        System.out.println(fac(5));

    }

    // method 1
    public static void print(int n) {
        // condition
        if (n == 0) {
            return;
        }
        System.out.println(n);
        print(n - 1);
    }

    // method 2
    public static int fac(int n) {
        if (n == 0) {
            return 1;
        }
        return n * fac(n - 1);
    }
}
