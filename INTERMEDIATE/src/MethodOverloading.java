//0023
public class MethodOverloading {
    public static void main(String[] args) {
        // Java Method Overloading
        System.out.println("===== Java Method Overloading =====\n");


        // output
        whatIs();
        whatIs(534);
        whatIs("Hasan");
        whatIs(5);

    }

    // method
    public static void whatIs() {
        System.out.println("This is method");
    }

    public static void whatIs(String name) {
        System.out.println("This is " + name);
    }

    public static void whatIs(int number) {
        System.out.println(number + " Bum​ blast🔥​🔥​🔥");
    }
    // note: multiple methods can have the same name with different parameters & different type:

}
