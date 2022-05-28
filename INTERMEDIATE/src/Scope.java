//0024
public class Scope {

    public static void main(String[] args) {
        // Java Scope
        System.out.println("===== Java Scope =====");

        // Code here CANNOT use x
        // System.out.println(x);

        int x = 100;

        // Code here can use x
        System.out.println(x);


        { // This is a block


            // Code here CANNOT use x
            // System.out.println(name);

            String name = "Hasan Himmat";

            // Code here CAN use x
            System.out.println(name);

        } // The block ends here


    }
}



