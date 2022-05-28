//0018
public class BreakContinue {
    public static void main(String[] args) {
        // Java Break and Continue
        System.out.println("===== Java Break and Continue =====\n");


        // break
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            if (i == 5 || i == 9) {
                break;
            }
        }


        System.out.println("\n=====\n");

        // continue
        for (int i = 1; i <= 10; i++) {
            if (i == 5 || i == 9) {
                continue;
            }
            System.out.println(i);
        }
    }
}
