import java.io.File;

//00
public class Files {
    public static void main(String[] args){
        // Java Files
        System.out.println("===== Java Files =====");

        File myObj = new File("filename.txt");

        System.out.println(myObj.delete());

    }
}
