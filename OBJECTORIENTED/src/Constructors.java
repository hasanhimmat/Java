//0029
public class Constructors {

    public static void main(String[] args) {
        // Java Constructors
        System.out.println("===== Java Constructors =====");


        // object making
        SayHi greet = new SayHi("Hasan");

        // method call
        greet.developer();
        greet.Human();
        greet.Dog();
        greet.Cat();

    }

}


// another class
class SayHi {

    String name;

    // Constructor method
    public SayHi(String name) {
        this.name = name;
    }

    // constructor method use
    public void developer() {
        System.out.println("Software Developer: " + name);
    }

    // method-1
    public void Human() {
        System.out.println("Assalamu Alaikum");
    }

    // method-2
    public void Dog() {
        System.out.println("Geo! Geo! Geo!");
    }

    // method-3
    public void Cat() {
        System.out.println("Meow! Meow!");
    }
}
