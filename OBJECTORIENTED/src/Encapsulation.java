//0031
public class Encapsulation {
    // Variable Encapsulation
    private String name;
    private int age;
    private float height;


    // getter & setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public static void main(String[] args){
        // Java Encapsulation
        System.out.println("===== Java Encapsulation =====");

        // object
        Encapsulation obj = new Encapsulation();

        obj.setName("Hasan");
        prln(obj.getName());

        obj.setAge(21);
        prln(obj.getAge());

        obj.setHeight(5.9f);
        prln(obj.getHeight());

    }



    // ***** Custom Method *****//
    private static void prln(Object obj){
        System.out.println(obj);
    }
}
