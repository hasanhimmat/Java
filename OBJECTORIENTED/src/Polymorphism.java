//0034
public class Polymorphism extends Animal {

    // method
    void girl() {
        System.out.println("My name is girl");
    }

    void girl(String me) {
        System.out.println("My husband name is " + me);
    }

    void display() {
        System.out.println("This is polymorphism method");
    }

    public static void main(String[] args) {
        // Java Polymorphism
        System.out.println("===== Java Polymorphism =====");

        // method overloading compile-time polymorphism
        // Object
        Polymorphism obj = new Polymorphism();
        obj.girl();
        obj.girl("Hasan");
        System.out.println("==========");

        // method overriding run-time polymorphism
        Animal e = new Animal();
        e.display();
        System.out.println("==========");
        e = new Polymorphism();
        e.display();
    }

}
