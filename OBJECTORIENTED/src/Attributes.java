//0027
public class Attributes {

    // attributes
    String name = "Hasanur Rahman";
    int age = 21;

    public static void main(String[] args) {
        // Java Class Attributes
        System.out.println("===== Java Class Attributes =====");

        // object making
        Attributes value = new Attributes();

        // object call
        System.out.println("My name is " + value.name);
        System.out.println("My age is " + value.age);

    }
}
