//0026
public class OOP {
    public static void main(String[] args) {
        // Object-Oriented Programming.
        System.out.println("===== Object-Oriented Programming =====");

        // object making
        Human hasan = new Human();

        // method call
        hasan.sayHi("Google");

    }

}

// another class
class Human {
    public void sayHi(String name) {
        System.out.println("Hello " + name);
    }
}
