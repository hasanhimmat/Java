//0035
public class InnerClasses {
    public static void main(String[] args) {
        // Java Inner Classes
        System.out.println("===== Java Inner Classes =====");
        // Object
        OuterClass obj1 = new OuterClass();
        obj1.x = 10;
        System.out.println(obj1.x);
        System.out.println("==========");

        //OuterClass.InnerClass obj2 = obj1.new InnerClass();
        OuterClass.InnerClass obj2;
        obj2 = obj1.new InnerClass();
        obj2.y = 20;
        System.out.println(obj2.y);
    }
}

// outer class
class OuterClass {
    int x;

    // inner class
    class InnerClass {
        int y;
    }
}
