//0028
public class ClassMethods {

    // method-1
    public void sayHi(){
        System.out.println("Hello World!");
    }


    // method-2
    public void bomb(){
        System.out.println("Bom blast success\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25");
    }

    // method-3
    public void speed(int maxSpeed){
        System.out.println("Max speed is: " + maxSpeed);
    }

    public static void main(String[] args){
        // Java Class Methods
        System.out.println("===== Java Class Methods =====");

        // object call
        ClassMethods obj = new ClassMethods();
        obj.sayHi();
        obj.bomb();
        obj.speed(250);

    }
}
